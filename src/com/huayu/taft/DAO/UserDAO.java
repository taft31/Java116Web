package com.huayu.taft.DAO;

import com.huayu.taft.Model.User;
import com.huayu.taft.Util.UserAcount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by taft on 15/7/7.
 */
public class UserDAO extends BaseDAO {
    private Connection conn = null;
    private PreparedStatement prestat = null;
    private ResultSet rs = null;

    public User userLogin(String userName,String userPass){
        System.out.println("有人来登录了");
        String sql = "select * from users where userName = ? and userPass = ?";
        conn = getConn();
        System.out.println("连接信息："+conn);
        try {
            prestat = conn.prepareStatement(sql);
            prestat.setString(1,userName);
            prestat.setString(2,userPass);
            rs = prestat.executeQuery();
            boolean isExite = false;
            User user = new User();
            while (rs.next()){
                System.out.println("获取到信息");
                isExite = true;
                user.setUserID(rs.getString("userID"));
                user.setUserName(rs.getString("userName"));
                user.setUserPass(rs.getString("userPass"));
                user.setUserRealName(rs.getString("userRealName"));
                user.setUserBirth(rs.getDate("userBirth"));
                user.setUserGender(rs.getString("userGender"));
                user.setUserCreateDate(rs.getDate("userCreateDate"));
                user.setUserState(rs.getInt("userState"));
            }
            if(isExite){
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll();
        }
        return null;
    }
    public UserAcount<String> getUserAcount(){
        conn = getConn();
        String sql = "select userName from users";
        try {
            prestat = conn.prepareStatement(sql);
            rs = prestat.executeQuery();
            boolean flag = false;
            UserAcount<String> uac = UserAcount.getInstance();
            while (rs.next()){
                flag = true;
                uac.add(rs.getString(1));
            }
            return uac;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
