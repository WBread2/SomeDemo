package com.wbread.jeenchtest.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.wbread.jeenchtest.R;
import com.wbread.jeenchtest.data.GoodsItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 04.11.2017.
 */

public class GoodsRecyclerAdapter extends RecyclerView.Adapter<GoodsRecyclerAdapter.ViewHolder> {


    private final Context mContext;
    private final List<GoodsItem> mGoods = new ArrayList<>();

    public GoodsRecyclerAdapter(Context context) {
        mContext = context;
    }

    public void setGoods(List<GoodsItem> newGoods) {
        mGoods.clear();
        mGoods.addAll(newGoods);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.goods_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        String sPrice = "$" + mGoods.get(position).getItemPrice();
        String sDistance = mGoods.get(position).getPointDistance() + " km";

        holder.tvItemName.setText(mGoods.get(position).getItemName());
        holder.tvItemPrice.setText(sPrice);
        holder.tvShopName.setText(mGoods.get(position).getShopName());
        holder.tvPointDistance.setText(sDistance);

        holder.ivItemImage.setImageURI(Uri.parse(mGoods.get(position).getItemImage()));
        holder.ivShopLogo.setImageURI(Uri.parse(mGoods.get(position).getShopLogo()));

        holder.pbShopRank.setProgress((int)Float.parseFloat(mGoods.get(position).getShopRank()));
    }

    @Override
    public int getItemCount() {
        return mGoods.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final ImageView ivItemImage;
        public final TextView tvItemName;
        public final TextView tvItemPrice;
        public final TextView tvShopName;
        public final TextView tvPointDistance;
        public final ImageView ivShopLogo;
        public final ProgressBar pbShopRank;

        public ViewHolder(View view) {
            super(view);
            ivItemImage = (ImageView) view.findViewById(R.id.ivItemImage);
            tvItemName = (TextView) view.findViewById(R.id.tvItemName);
            tvItemPrice = (TextView) view.findViewById(R.id.tvItemPrice);
            tvShopName = (TextView) view.findViewById(R.id.tvShopName);
            tvPointDistance = (TextView) view.findViewById(R.id.tvPointDistance);
            ivShopLogo = (ImageView) view.findViewById(R.id.ivShopLogo);
            pbShopRank = (ProgressBar) view.findViewById(R.id.pbShopRank);
        }
    }
}
