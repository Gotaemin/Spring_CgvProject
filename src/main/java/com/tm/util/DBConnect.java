package com.tm.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static Connection getConnection() throws Exception {
		Connection conn = null;
		
		String user = "tm";
		String password = "tm";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
//	public static void main(String[] args) {
//		
//		try {
//			Connection conn = DBConnect.getConnection();
//			
//			if(conn != null) {
//				System.out.println(conn);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
