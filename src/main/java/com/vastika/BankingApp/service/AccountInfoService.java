package com.vastika.BankingApp.service;

import java.util.List;

import com.vastika.BankingApp.model.AccountInfo;

public interface AccountInfoService {

	int insertAccInfo(AccountInfo accInfo);
	
	int updateAccInfo(AccountInfo accInfo);
	
	void deleteAccInfo(int id);
	
	AccountInfo getAccInfoById(int id);
	
	List<AccountInfo> getAllAccInfo();
}
