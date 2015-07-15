package com.huayu.taft.Model;

/**
 * Created by taft on 15/7/14.
 */
public class Manager {
    private String managerID;
    private String managerName;
    private String managerPass;
    private int managerState;

    public Manager() {
    }

    public Manager(String managerID, String managerName, String managerPass, int managerState) {
        this.setManagerID(managerID);
        this.setManagerName(managerName);
        this.setManagerPass(managerPass);
        this.setManagerState(managerState);
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPass() {
        return managerPass;
    }

    public void setManagerPass(String managerPass) {
        this.managerPass = managerPass;
    }

    public int getManagerState() {
        return managerState;
    }

    public void setManagerState(int managerState) {
        this.managerState = managerState;
    }
}
