package com.wbread.jeenchtest.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 */

public class GoodsItem {

    @SerializedName("point_id")
    @Expose
    private String pointId;
    @SerializedName("shop_id")
    @Expose
    private String shopId;
    @SerializedName("point_address")
    @Expose
    private String pointAddress;
    @SerializedName("point_coords")
    @Expose
    private String pointCoords;
    @SerializedName("point_rank")
    @Expose
    private String pointRank;
    @SerializedName("point_distance")
    @Expose
    private String pointDistance;
    @SerializedName("point_time_id")
    @Expose
    private String pointTimeId;
    @SerializedName("shop_name")
    @Expose
    private String shopName;
    @SerializedName("shop_logo")
    @Expose
    private String shopLogo;
    @SerializedName("shop_rank")
    @Expose
    private String shopRank;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("item_is_liked")
    @Expose
    private String itemIsLiked;
    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("item_name")
    @Expose
    private String itemName;
    @SerializedName("item_image")
    @Expose
    private String itemImage;
    @SerializedName("item_price")
    @Expose
    private String itemPrice;
    @SerializedName("item_bonus_amount")
    @Expose
    private String itemBonusAmount;
    @SerializedName("item_bonus_price")
    @Expose
    private Object itemBonusPrice;
    @SerializedName("item_likes")
    @Expose
    private String itemLikes;
    @SerializedName("item_shares")
    @Expose
    private String itemShares;
    @SerializedName("item_comments")
    @Expose
    private String itemComments;
    @SerializedName("group_type")
    @Expose
    private String groupType;

    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPointAddress() {
        return pointAddress;
    }

    public void setPointAddress(String pointAddress) {
        this.pointAddress = pointAddress;
    }

    public String getPointCoords() {
        return pointCoords;
    }

    public void setPointCoords(String pointCoords) {
        this.pointCoords = pointCoords;
    }

    public String getPointRank() {
        return pointRank;
    }

    public void setPointRank(String pointRank) {
        this.pointRank = pointRank;
    }

    public String getPointDistance() {
        return pointDistance;
    }

    public void setPointDistance(String pointDistance) {
        this.pointDistance = pointDistance;
    }

    public String getPointTimeId() {
        return pointTimeId;
    }

    public void setPointTimeId(String pointTimeId) {
        this.pointTimeId = pointTimeId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getShopRank() {
        return shopRank;
    }

    public void setShopRank(String shopRank) {
        this.shopRank = shopRank;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getItemIsLiked() {
        return itemIsLiked;
    }

    public void setItemIsLiked(String itemIsLiked) {
        this.itemIsLiked = itemIsLiked;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemBonusAmount() {
        return itemBonusAmount;
    }

    public void setItemBonusAmount(String itemBonusAmount) {
        this.itemBonusAmount = itemBonusAmount;
    }

    public Object getItemBonusPrice() {
        return itemBonusPrice;
    }

    public void setItemBonusPrice(Object itemBonusPrice) {
        this.itemBonusPrice = itemBonusPrice;
    }

    public String getItemLikes() {
        return itemLikes;
    }

    public void setItemLikes(String itemLikes) {
        this.itemLikes = itemLikes;
    }

    public String getItemShares() {
        return itemShares;
    }

    public void setItemShares(String itemShares) {
        this.itemShares = itemShares;
    }

    public String getItemComments() {
        return itemComments;
    }

    public void setItemComments(String itemComments) {
        this.itemComments = itemComments;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}
