package com.wbread.jeenchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.wbread.jeenchtest.adapter.GoodsRecyclerAdapter;
import com.wbread.jeenchtest.data.GoodsItem;
import com.wbread.jeenchtest.data.SearchGoodsResponse;
import com.wbread.jeenchtest.network.JeenchAPI;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Disposable goodsSubscription;
    private RecyclerView goodsRecyclerView;
    private ProgressBar progressBar;
    private GoodsRecyclerAdapter goodsRecyclerAdapter;

    private Retrofit retrofit;


    static final private String BASE_URL = "https://api.jeench.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureLayout();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        getGoodsData();

    }

    private void getGoodsData(){
        Observable<SearchGoodsResponse> goodsObservable = retrofit.create(JeenchAPI.class)
                        .getSearchGoodsResponse();

        goodsSubscription = goodsObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults, this::handleError );
    }

    private void handleResults(SearchGoodsResponse response){
        if (response.getGoodsItemList() != null) {

            for(GoodsItem goodsItem : response.getGoodsItemList()){
                System.out.println("Name: " + goodsItem.getItemName());
            }

            displayGoods(response.getGoodsItemList());

        } else {
            List<GoodsItem> goods = new ArrayList<>();

            displayGoods(goods);
        }
    }

    private void handleError(Throwable t){
        t.printStackTrace();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (goodsSubscription != null && !goodsSubscription.isDisposed()) {
            goodsSubscription.dispose();
        }
    }

    private void displayGoods(List<GoodsItem> goods) {
        goodsRecyclerAdapter.setGoods(goods);
        progressBar.setVisibility(View.GONE);
        goodsRecyclerView.setVisibility(View.VISIBLE);
    }

    private void configureLayout() {
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.loader);
        goodsRecyclerView = (RecyclerView) findViewById(R.id.goods_list);
        goodsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        goodsRecyclerAdapter = new GoodsRecyclerAdapter(this);
        goodsRecyclerView.setAdapter(goodsRecyclerAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (goodsSubscription!=null && !goodsSubscription.isDisposed()) {
            goodsSubscription.dispose();
        }
    }


}
