package com.xoriant.bank.dao;

import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.PersonInfo;

public interface ManagerDao {

public Branch addNewBranch(Branch branch);

public PersonInfo addNewPerson(PersonInfo personInfo);

public int updateCustomer(int accountNumber,PersonInfo personInfo);
}
