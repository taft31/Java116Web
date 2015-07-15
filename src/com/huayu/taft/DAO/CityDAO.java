package com.huayu.taft.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.org.apache.bcel.internal.generic.Select;

public class CityDAO extends BaseDAO{
	private Connection conn = null;
	private PreparedStatement prestat = null;
	private ResultSet rs = null;
	public String getCityInfo(String name){
		
		String str = "";
		try {
			if(name.equals("初始化")){
				conn = getConn();
				prestat = conn.prepareStatement("select name from information where rid = 0");
				rs = prestat.executeQuery();
				while(rs.next()){
					str+=rs.getString(1)+",";
				}
				closeAll();
			}else{
				conn = getConn();
				String sql = "select name from information where rid = (select id from information where name=?)";
				prestat = conn.prepareStatement(sql);
				prestat.setString(1, name);
				rs = prestat.executeQuery();
				while(rs.next()){
					str+= rs.getString(1)+",";
				}
				closeAll();
			}
		} catch (Exception e) {
		}
		return str;
		}
}
