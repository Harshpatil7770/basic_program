package com.xoriant.bank.service;

import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.PersonInfo;

public interface ManagerService {

	public Branch addNewBranch(Branch branch);
	
	public PersonInfo addNewPerson(PersonInfo personInfo);
	
	public int updateCustomer(int accountNumber,PersonInfo personInfo);
}
