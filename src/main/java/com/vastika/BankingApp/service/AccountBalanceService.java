package com.vastika.BankingApp.service;

import java.util.List;
import java.util.Scanner;

import com.vastika.BankingApp.model.AccountBalance;

public interface AccountBalanceService {

	int depositAmount(AccountBalance accBal);
	
	int updateAmount(AccountBalance accBal);
	
	void deleteAmount(int id);
	
	AccountBalance getLatestAccBalByAccountId(int id);
	
	//int withdrawAmount(AccountBalance accBal);
	
	//void withdrawAmount(int id);
	void withdrawAmount(AccountBalance accBal);
	
	AccountBalance getAccBalById(int id);
	
	List<AccountBalance> getAllAccBal();
	
	

}
