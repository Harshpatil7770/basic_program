package com.xoriant.bank.service;

import java.util.List;

import com.xoriant.bank.dao.util.CustomerDTO;
import com.xoriant.bank.dao.util.UserDTO;
import com.xoriant.bank.model.AccountDetails;
import com.xoriant.bank.model.Address;
import com.xoriant.bank.model.TransactionDetails;

public interface CustomerService {

	public Address editAddress(Address address,int customerId);
	
	public List<AccountDetails> findAccountDetails(int accountNumber);
	
	public String withdrawMoney(double amount,int accountNumber,String description,String userType,String transactionType,String accountType);
	
	public String depositeMoney(double amount,int accountNumber,String description,String userType,String transactionType,String accountType);
	
	public String fundTransfer(double amount,int accountNumber,String description,String userType,String transactionType,String accountType);
	
	public String checkBalance(int accountNumber);
	
	public List<TransactionDetails> miniStatement(int accountNumber);
	
	public String changePassword(UserDTO userDTO);
}
