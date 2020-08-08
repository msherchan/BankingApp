package com.vastika.BankingApp.model;

public class AccountBalance {
	
	private double deposit_amount;
	private double withdraw_amount;
	private int accountInfoId;
	
	public double getDeposit_amount() {
		return deposit_amount;
	}
	public void setDeposit_amount(double deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	public double getWithdraw_amount() {
		return withdraw_amount;
	}
	public void setWithdraw_amount(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}
	public int getAccountInfoId() {
		return accountInfoId;
	}
	public void setAccountInfoId(int accountInfoId) {
		this.accountInfoId = accountInfoId;
	}
	

}
