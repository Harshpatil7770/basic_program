package com.xoriant.bank.dao;

import java.util.List;

import com.xoriant.bank.model.TransactionDetails;
import com.xoriant.bank.model.util.CustomerDTO;

public interface TransactionDao {

	public String withdrawMoney(CustomerDTO customerDTO);
	
	public String depositeMoney(CustomerDTO customerDTO);
	
	public List<TransactionDetails> miniStatement(int accountNumber);
	
	public String fundTransfer(CustomerDTO customerDTO);
	
	public String checkBalance(int accountNumber);
}
