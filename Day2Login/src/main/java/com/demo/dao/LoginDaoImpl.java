package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao {
	static Connection conn;
	static PreparedStatement seluser,insuser;
	static {
		try {
			conn= DBUtil.getMyConnection();
			seluser = conn.prepareStatement("select username, password, Role from user where username=? and password=?;");
			insuser=conn.prepareStatement("insert into user(username,password,Role,Name) values(?,?,?,?);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public MyUser finduser(String uname, String pass) {
		try {
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs = seluser.executeQuery();
			if(rs.next()) {
				return new MyUser(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public boolean addnewUser(String uname, String pass, String nm) {
		try {
			insuser.setString(1, uname);
			insuser.setString(2, pass);
			insuser.setString(3,"user");
			insuser.setString(4,nm);
			int n=insuser.executeUpdate();
			return n>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
