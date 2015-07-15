package com.huayu.taft.Model;

/**
 * Created by taft on 15/7/14.
 */
public class OrderDetailID {
    private String orderDetailID;
    private String orderID;
    private String goodID;
    private int goodCount;

    public OrderDetailID() {
    }

    public OrderDetailID(String orderDetailID, String orderID, String goodID, int goodCount) {
        this.setOrderDetailID(orderDetailID);
        this.setGoodID(goodID);
        this.setGoodCount(goodCount);
        this.setOrderID(orderID);
    }

    public String getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(String orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
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
