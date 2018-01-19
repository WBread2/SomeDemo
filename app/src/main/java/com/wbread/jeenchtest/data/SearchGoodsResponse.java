package com.wbread.jeenchtest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Acer on 05.11.2017.
 */

public class SearchGoodsResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private List<GoodsItem> goodsItemList = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<GoodsItem> getGoodsItemList() {
        return goodsItemList;
    }

    public void setGoodsItemList(List<GoodsItem> goodsItemList) {
        this.goodsItemList = goodsItemList;
    }

}
