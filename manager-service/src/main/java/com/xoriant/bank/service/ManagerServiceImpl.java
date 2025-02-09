package com.xoriant.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.dao.ManagerDao;
import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.PersonInfo;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerDao managerDao;

	@Override
	public Branch addNewBranch(Branch branch) {
		// TODO Auto-generated method stub
		return managerDao.addNewBranch(branch);
	}

	@Override
	public PersonInfo addNewPerson(PersonInfo personInfo) {
		// TODO Auto-generated method stub
		return managerDao.addNewPerson(personInfo);
	}

	@Override
	public int updateCustomer(int accountNumber, PersonInfo personInfo) {
		// TODO Auto-generated method stub
		return managerDao.updateCustomer(accountNumber, personInfo);
	}
}
