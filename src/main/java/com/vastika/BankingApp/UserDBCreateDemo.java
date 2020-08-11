package com.vastika.BankingApp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.vastika.BankingApp.util.QueryUtil;

public class UserDBCreateDemo {

public static void main(String[] args) {
		
	try (
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC","root","root1234");

			 PreparedStatement ps = con.prepareStatement(QueryUtil.CREATE_DATABASE_SQL);)
				
			{
			ps.executeUpdate();
			System.out.println("Database created!!");
			
			} 
		
			catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
