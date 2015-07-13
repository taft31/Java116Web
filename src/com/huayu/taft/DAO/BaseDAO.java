package com.huayu.taft.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDAO {
	final String driver = "com.mysql.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/java116Web?characterEncoding=utf8";
	final String user = "root";
	final String password = "java";
	private Connection conn = null;
	private PreparedStatement prestat = null;
	private ResultSet rs = null;
	public BaseDAO(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean doQuery(String sql,Object...param){
		conn = getConn();
		try {
			prestat =  conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				prestat.setObject((i+1), param[i]);
			}
			rs = prestat.executeQuery();
			if(rs.next()){
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeAll();
		}
		return false;
	}
	public boolean doExcute(String sql,Object...param){
		conn = getConn();
		try {
			prestat = conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				prestat.setObject((i+1), param[i]);
			}
			int rows = prestat.executeUpdate();
			if(rows!=0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll();
		}
		return false;
		
	}
	public Connection getConn(){
		try {
			conn =  DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void closeAll(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(prestat!=null){
			try {
				prestat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
