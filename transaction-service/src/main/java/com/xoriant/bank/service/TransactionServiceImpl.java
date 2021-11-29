package com.xoriant.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.dao.TransactionDao;
import com.xoriant.bank.model.TransactionDetails;
import com.xoriant.bank.model.util.CustomerDTO;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionDao transactionDao;
	
	@Override
	public String withdrawMoney(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return transactionDao.withdrawMoney(customerDTO);
	}

	@Override
	public String depositeMoney(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return transactionDao.depositeMoney(customerDTO);
	}

	@Override
	public List<TransactionDetails> miniStatement(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionDao.miniStatement(accountNumber);
	}

	@Override
	public String fundTransfer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return transactionDao.fundTransfer(customerDTO);
	}

	@Override
	public String checkBalance(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionDao.checkBalance(accountNumber);
	}

}
