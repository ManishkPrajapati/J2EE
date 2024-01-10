package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDb {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step 2--Get connection
			String url="jdbc:mysql://localhost:3306/user1?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"root","Sword@353730");
			if (conn!=null) {
				System.out.println("connection done");
			}

		} catch (SQLException e) {
			System.out.println("Error occured"+e.getMessage());
			e.printStackTrace();
		}
		

	}

}
