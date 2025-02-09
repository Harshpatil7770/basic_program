package com.xoriant.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.dao.CustomerDao;
import com.xoriant.bank.dao.util.UserDTO;
import com.xoriant.bank.model.AccountDetails;
import com.xoriant.bank.model.Address;
import com.xoriant.bank.model.TransactionDetails;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	TransactionServiceProxy transactionServiceProxy;
	
	@Autowired
	UserServiceProxy userServiceProxy;
	
	@Override
	public Address editAddress(Address address,int customerId) {
		// TODO Auto-generated method stub
		return customerDao.editAddress(address,customerId);
	}



	@Override
	public List<AccountDetails> findAccountDetails(int accountNumber) {
		// TODO Auto-generated method stub
		return customerDao.findAccountDetails(accountNumber);
	}



	@Override
	public String withdrawMoney(double amount, int accountNumber, String description,String userType, String transactionType,
			String accountType) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.withdrawMoney(accountNumber, amount, description,userType, transactionType);
	}



	@Override
	public String depositeMoney(double amount, int accountNumber, String description,String userType, String transactionType,
			String accountType) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.depositeMoney(accountNumber, amount, description,userType, description, transactionType);
	}



	@Override
	public String fundTransfer(double amount, int accountNumber, String description,String userType, String transactionType,
			String accountType) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.fundTransfer(accountNumber, amount, description, description,userType, transactionType);
	}



	@Override
	public String checkBalance(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.checkBalance(accountNumber);
	}



	@Override
	public List<TransactionDetails> miniStatement(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.miniStatement(accountNumber);
	}



	@Override
	public String changePassword(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return userServiceProxy.changePassword(userDTO);
	}




	
}
