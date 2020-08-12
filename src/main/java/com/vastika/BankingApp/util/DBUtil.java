package com.vastika.BankingApp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/BankingApp?serverTimezone=UTC";
	public static final String USER_NAME = "";
	public static final String PASSWORD = "";
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
	
	Class.forName(DRIVER_NAME);
		
		
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		
	}
	
	
}
