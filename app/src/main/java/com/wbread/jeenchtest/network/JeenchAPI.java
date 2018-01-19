package com.wbread.jeenchtest.network;

import com.wbread.jeenchtest.data.SearchGoodsResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 */

public interface JeenchAPI {

    @GET("/v1/search-items")
    Observable<SearchGoodsResponse> getSearchGoodsResponse();
//    Observable<String> getSearchGoodsResponse();
}
