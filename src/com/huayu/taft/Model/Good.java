package com.huayu.taft.Model;

import java.util.Date;

/**
 * Created by taft on 15/7/13.
 */
public class Good {
    private String goodID;
    private int goodBatch;
    private String goodName;
    private double goodPrice;
    private Date goodMadeTime;
    private int goodExpireTime;
    private String goodImg;
    private int goodState;
    private String goodRID;

    public Good() {
    }

    public Good(String goodID, int goodBatch, String goodName, double goodPrice, Date goodMadeTime, int goodExpireTime, String goodImg, int goodState, String goodRID) {
       this.setGoodBatch(goodBatch);
        this.setGoodExpireTime(goodExpireTime);
        this.setGoodID(goodID);
        this.setGoodName(goodName);
        this.setGoodImg(goodImg);
        this.setGoodMadeTime(goodMadeTime);
        this.setGoodState(goodState);
        this.setGoodRID(goodRID);
        this.setGoodPrice(goodPrice);
    }

    public String getGoodID() {
        return goodID;
    }

    public void setGoodID(String goodID) {
        this.goodID = goodID;
    }

    public int getGoodBatch() {
        return goodBatch;
    }

    public void setGoodBatch(int goodBatch) {
        this.goodBatch = goodBatch;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Date getGoodMadeTime() {
        return goodMadeTime;
    }

    public void setGoodMadeTime(Date goodMadeTime) {
        this.goodMadeTime = goodMadeTime;
    }

    public int getGoodExpireTime() {
        return goodExpireTime;
    }

    public void setGoodExpireTime(int goodExpireTime) {
        this.goodExpireTime = goodExpireTime;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public int getGoodState() {
        return goodState;
    }

    public void setGoodState(int goodState) {
        this.goodState = goodState;
    }

    public String getGoodRID() {
        return goodRID;
    }

    public void setGoodRID(String goodRID) {
        this.goodRID = goodRID;
    }
}
