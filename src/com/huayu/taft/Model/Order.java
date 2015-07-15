package com.huayu.taft.Model;

import java.util.Date;

/**
 * Created by taft on 15/7/14.
 */
public class Order {
    private String orderID;
    private Date orderTime;
    private String userID;
    private int orderState;

    public Order() {
    }

    public Order(String orderID, Date orderTime, String userID, int orderState) {
        this.setOrderID(orderID);
        this.setOrderState(orderState);
        this.setOrderTime(orderTime);
        this.setUserID(userID);
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }
}
