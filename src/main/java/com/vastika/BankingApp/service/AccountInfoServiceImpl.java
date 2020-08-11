package com.vastika.BankingApp.service;

import java.util.List;

import com.vastika.BankingApp.dao.AccountInfoDao;
import com.vastika.BankingApp.dao.AccountInfoDaoImpl;
import com.vastika.BankingApp.model.AccountInfo;

public class AccountInfoServiceImpl implements AccountInfoService {
	
	AccountInfoDao accInfoDao = new AccountInfoDaoImpl();

	@Override
	public int insertAccInfo(AccountInfo accInfo) {

		return accInfoDao.insertAccInfo(accInfo) ;
	}

	@Override
	public int updateAccInfo(AccountInfo accInfo) {
		
		return accInfoDao.updateAccInfo(accInfo);
	}

	@Override
	public void deleteAccInfo(int id) {
		
		accInfoDao.deleteAccInfo(id);
	}

	@Override
	public AccountInfo getAccInfoById(int id) {
		
		return accInfoDao.getAccInfoById(id);
	}

	@Override
	public List<AccountInfo> getAllAccInfo() {
		
		return accInfoDao.getAllAccInfo();
	}

}
