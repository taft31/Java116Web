package com.huayu.taft.Model;

import java.util.Date;

/**
 * Created by taft on 15/7/7.
 */
public class User {
    private String userID;
    private String userName;
    private String userPass;
    private String userRealName;
    private String userGender;
    private Date userBirth;
    private Date userCreateDate;
    private int userState;

    public User() {
    }

    public User(String userID, String userName, String userPass, String userRealName, String userGender, Date userBirth, Date userCreateDate, int userState) {
        this.setUserID(userID);
        this.setUserState(userState);
        this.setUserCreateDate(userCreateDate);
        this.setUserName(userName);
        this.setUserGender(userGender);
        this.setUserBirth(userBirth);
        this.setUserPass(userPass);
        this.setUserRealName(userRealName);
    }

    public String getUserID() {
        return userID;
    }


    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public Date getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userBirth=" + userBirth +
                ", userCreateDate=" + userCreateDate +
                ", userState=" + userState +
                '}';
    }
}
