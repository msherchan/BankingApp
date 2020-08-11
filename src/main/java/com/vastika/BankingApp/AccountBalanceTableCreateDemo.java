package com.vastika.BankingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.BankingApp.util.DBUtil;
import com.vastika.BankingApp.util.QueryUtil;

public class AccountBalanceTableCreateDemo {
	
public static void main(String[] args) {
		
		try (
			 Connection con = DBUtil.getConnection();
			 PreparedStatement ps = con.prepareStatement(QueryUtil.CREATE_TABLE_SQL2);)
				
			{
			ps.executeUpdate();
			System.out.println("AccountBalance table created!!");
			
			} 
		
			catch (ClassNotFoundException|SQLException e) {
				
				e.printStackTrace();
			}
	}

}
