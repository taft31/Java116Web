package com.huayu.taft.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by taft on 15/7/15.
 */
public class ProduceID {
    private String keyType;
    private String keyValue;

    public ProduceID() {
    }

    public ProduceID(String keyType, String keyValue) {
        this.setKeyType(keyType);
        this.setKeyValue(keyValue);
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }


    public String getKey() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    final char[] keys = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public String getID() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String str = sdf.format(new Date());
        StringBuffer stb = new StringBuffer();
        if (keyType == null) {
            for (int kk = 0; kk < 16; kk++) {
                stb.append(keys[(int) (Math.random() * 16)]);
            }
            return str + stb.toString();
        } else {
            SimpleDateFormat sdf1 = new SimpleDateFormat("ddHHmmssSSS");
            String str1 = sdf1.format(new Date());
            int len = keyType.length() + keyValue.length() + str1.length();
            if (len <= 32) {
                for (int kk = 0; kk < 32 - len; kk++) {
                    stb.append(keys[(int) (Math.random() * 16)]);
                }
                return keyType + keyValue + str1 + stb.toString();
            }else{
                return keyType + keyValue + str1.substring(len-32);
            }
        }
    }
}
