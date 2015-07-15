package com.huayu.taft.Model;

/**
 * Created by taft on 15/7/14.
 */
public class Stock {
    private String stockID;
    private String goodID;
    private int goodBatch;
    private int goodCount;

    public Stock() {
    }

    public Stock(String stockID, String goodID, int goodBatch, int goodCount) {
        this.setGoodID(goodID);
        this.setStockID(stockID);
        this.setGoodBatch(goodBatch);
        this.setGoodCount(goodCount);
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
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

    public int getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(int goodCount) {
        this.goodCount = goodCount;
    }
}
