package com.huayu.taft.Util;

import java.util.HashSet;

/**
 * Created by taft on 15/7/15.
 */
public class UserAcount<String> extends HashSet{
    private UserAcount(){
    }
    private static UserAcount uc;
    public static UserAcount getInstance(){
        if(uc==null){
            uc = new UserAcount();
            return uc;
        }else{
            return uc;
        }
    }
}
