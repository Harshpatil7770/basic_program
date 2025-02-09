package com.xoriant.bank.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.bank.dao.util.CommonMethod;
import com.xoriant.bank.dao.util.DBquries;
import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.PersonInfo;

@Repository
public class ManagerDaoImpl implements ManagerDao{

	public static final String CUSTOMER="CUSTOMER";
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Branch addNewBranch(Branch branch) {
		// TODO Auto-generated method stub
		int res= jdbcTemplate.update(DBquries.ADD_NEW_BRANCH,CommonMethod.getBranchId(),
				branch.getBranchName(),branch.getIfscCode(),branch.getMicrCode(),branch.getManagerId());
		if(res!=0) {
			return branch;
		}
		return null;
	}

	@Override
	public PersonInfo addNewPerson(PersonInfo personInfo) {
		
		personInfo.getAddress().setAddressId(CommonMethod.getAddressId());
		System.out.println("PERSON ID::"+personInfo);
		personInfo.setPersonId(CommonMethod.getPersonId());
	
		
		int result=jdbcTemplate.update(DBquries.ADD_NEW_ADDRESS,personInfo.getAddress().getAddressId(),
				personInfo.getAddress().getDoorNo(),personInfo.getAddress().getCity(),personInfo.getAddress().getArea(),
				personInfo.getAddress().getState(),personInfo.getAddress().getPincode(),personInfo.getAddress().getAddressType(),
				personInfo.getAddress().getBranchId(),personInfo.getPersonId());
		
		System.out.println("===========Address Inserted Succesfully========");
		
		if(personInfo.getAddress().getAddressId()!=0) {
		
		int res=jdbcTemplate.update(DBquries.ADD_NEW_PERSON,CommonMethod.getPersonId(),personInfo.getPersonName(),
				personInfo.getDob(),personInfo.getPhoneNumber(),CommonMethod.getAddressId(),personInfo.getPersonType(),
				personInfo.getRole(),personInfo.getGender());
		
		System.out.println("============Person Inserted Succesfully========");
		
		if(personInfo.getPersonType().equals(CUSTOMER)) {
			int res1=jdbcTemplate.update(DBquries.ADD_NEW_CUSTOMER,CommonMethod.getCustomerId(),personInfo.getPersonId());
			System.out.println("=========Customer Inserted=============");
			
		}
		return personInfo;
		
	}
		return null;
}
	
	public int updateCustomer(int accountNumber,PersonInfo personInfo) {
		int res= jdbcTemplate.update(DBquries.UPDATE_CUSTOMER,personInfo.getPersonName(),personInfo.getDob(),
				personInfo.getPhoneNumber(),accountNumber);
		if(res==1) 
			return res;
		return 0;
	}

}