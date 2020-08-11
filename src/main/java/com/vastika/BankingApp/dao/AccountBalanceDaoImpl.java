package com.vastika.BankingApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vastika.BankingApp.model.AccountBalance;
import com.vastika.BankingApp.model.AccountInfo;
import com.vastika.BankingApp.util.DBUtil;
import com.vastika.BankingApp.util.QueryUtil;

public class AccountBalanceDaoImpl implements AccountBalanceDao{

	@Override
	public int depositAmount(AccountBalance accBal) {
		
		int deposited = 0;
		
		try (
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL2);) {
			ps.setDouble(1, accBal.getDeposit_amount());
			ps.setDouble(2, accBal.getWithdraw_amount());
			ps.setDouble(3, accBal.getBalance());
			ps.setInt(4, accBal.getAccountInfoId());

			deposited = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return deposited;
	}


	@Override
	public int updateAmount(AccountBalance accBal) {
		
		int updated = 0;
		
		try(
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL2);)
				
			{
			ps.setDouble(1, accBal.getDeposit_amount());
			ps.setDouble(2, accBal.getWithdraw_amount());
			ps.setDouble(3, accBal.getBalance());
			ps.setInt(4, accBal.getAccountInfoId());
			
			updated = ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return updated;
		
		
	}

	@Override
	public void deleteAmount(int id) {
	//public int deleteAmount(AccountBalance accBal) {
		
		int deleted = 0;
		
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DELETE_SQL2);) {

				ps.setInt(1, id);
				ps.executeUpdate();

			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}
		
		}


	@Override
	public AccountBalance getAccBalById(int id) {
		
		AccountBalance accBal = new AccountBalance();
		
		try(
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL2);)
		
			{
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				accBal.setDeposit_amount(rs.getDouble("deposit_amount"));
				accBal.setWithdraw_amount(rs.getDouble("withdraw_amount"));
				accBal.setBalance(rs.getDouble("balance"));
				accBal.setAccountInfoId(rs.getInt("accountInfoId"));

			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return accBal;
	}
	
	@Override
	public AccountBalance getLatestAccBalByAccountId(int id) {
		
		AccountBalance accBal = new AccountBalance();
		
		try(
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BALANCE_BY_ACCT_ID);)
		
			{
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				accBal.setDeposit_amount(rs.getDouble("deposit_amount"));
				accBal.setWithdraw_amount(rs.getDouble("withdraw_amount"));
				accBal.setBalance(rs.getDouble("balance"));
				accBal.setAccountInfoId(rs.getInt("accountInfoId"));

			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return accBal;
	}

	@Override
	public List<AccountBalance> getAllAccBal() {
		
		List<AccountBalance> accBalList = new ArrayList<>();
		
		try(
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.LIST_SQL2);
				)
		{
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
			AccountBalance accBal = new AccountBalance();
			accBal.setDeposit_amount(rs.getDouble("deposit_amount"));
			accBal.setWithdraw_amount(rs.getDouble("withdraw_amount"));
			accBal.setBalance(rs.getDouble("balance"));
			accBal.setAccountInfoId(rs.getInt("accountInfoId"));
			accBalList.add(accBal);
				
			}
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return accBalList;
		
}


	

	@Override
	public void withdrawAmount(AccountBalance accBal) {
		
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.WITHDRAW_SQL);) {
			
				ps.setDouble(1, accBal.getDeposit_amount());
				ps.setDouble(2, accBal.getWithdraw_amount());
				ps.setDouble(3, accBal.getBalance());
				ps.setInt(4, accBal.getAccountInfoId());

				ps.executeUpdate();

			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}
			//return withdrawn;
		}

		
	}



	
