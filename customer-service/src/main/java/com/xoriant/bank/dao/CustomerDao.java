package com.xoriant.bank.dao;

import java.util.List;

import com.xoriant.bank.model.AccountDetails;
import com.xoriant.bank.model.Address;

public interface CustomerDao {

	public Address editAddress(Address address,int customerId);
	
	public List<AccountDetails> findAccountDetails(int accountNumber);
}
