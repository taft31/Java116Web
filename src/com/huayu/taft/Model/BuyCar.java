package com.huayu.taft.Model;

/**
 * Created by taft on 15/7/14.
 */
public class BuyCar {
    private String buycarID;
    private String userID;
    private String goodID;
    private int goodCount;

    public BuyCar() {
    }

    public BuyCar(String buycarID, String userID, String goodID, int goodCount) {
        this.setGoodID(goodID);
        this.setUserID(userID);
        this.setBuycarID(buycarID);
        this.setGoodCount(goodCount);
    }

    public String getBuycarID() {
        return buycarID;
    }

    public void setBuycarID(String buycarID) {
        this.buycarID = buycarID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGoodID() {
        return goodID;
    }

    public void setGoodID(String goodID) {
        this.goodID = goodID;
    }

    public int getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(int goodCount) {
        this.goodCount = goodCount;
    }
}
