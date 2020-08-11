package com.vastika.BankingApp.service;

import java.util.List;

import com.vastika.BankingApp.dao.AccountBalanceDao;
import com.vastika.BankingApp.dao.AccountBalanceDaoImpl;
import com.vastika.BankingApp.model.AccountBalance;

public class AccountBalanceServiceImpl implements AccountBalanceService{

	AccountBalanceDao accBalDao = new AccountBalanceDaoImpl();

	@Override
	public int depositAmount(AccountBalance accBal) {

		return accBalDao.depositAmount(accBal);
	}

	@Override
	public int updateAmount(AccountBalance accBal) {
		
		return accBalDao.updateAmount(accBal);
	}

	@Override
	public void deleteAmount(int id) {
		
		accBalDao.deleteAmount(id);
		
	}
	

	@Override
	public AccountBalance getAccBalById(int id) {
		
		return accBalDao.getAccBalById(id);
	}

	@Override
	public List<AccountBalance> getAllAccBal() {
		
		return accBalDao.getAllAccBal();
	}

	

	@Override
	public AccountBalance getLatestAccBalByAccountId(int id) {
		
		return accBalDao.getLatestAccBalByAccountId(id);
	}

	

	@Override
	public void withdrawAmount(AccountBalance accBal) {
		
		accBalDao.withdrawAmount(accBal);
		
		
	}

	

	

	

}
