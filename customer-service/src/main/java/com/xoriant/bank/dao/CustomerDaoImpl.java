package com.xoriant.bank.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.bank.dao.util.CommonMethod;
import com.xoriant.bank.dao.util.DBquries;
import com.xoriant.bank.model.AccountDetails;
import com.xoriant.bank.model.Address;
import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

@Autowired
JdbcTemplate jdbcTemplate;
	
	@Override
	public Address editAddress(Address address,int customerId) {
		
		int result= jdbcTemplate.update(DBquries.EDIT_ADDRESS,address.getDoorNo(),
				    address.getCity(),address.getArea(),address.getState(),
				    address.getPincode(), address.getAddressType(),customerId);
		
		System.out.println("==============Address Changed Succesfully===============");
		
		if(result!=0) {
			return address;
		}
		return null;	
	}

	@Override
	public List<AccountDetails> findAccountDetails(int accountNumber) {
		return jdbcTemplate.query(DBquries.VIEW_ACCOUNT_INFO,(ResultSet rs)->{
		List<AccountDetails> list=new ArrayList<AccountDetails>();
		if(rs.next()) {
			AccountDetails ac=new AccountDetails();
			Branch branch=new Branch();
			Customer customer=new Customer();
			
			ac.setAccountNumber(rs.getInt("account_number"));
			ac.setBalance(rs.getDouble("balance"));
			ac.setAccountType(rs.getString("account_type"));
			
			branch.setBranchId(rs.getInt("branch_id"));
			branch.setBranchName(rs.getString("branch_name"));
			branch.setIfscCode(rs.getString("ifsc_code"));
			branch.setMicrCode(rs.getString("micr_code"));
			
			customer.setCustomerId(rs.getInt("customer_id"));
			
			ac.setBranch(branch);
			ac.setCustomer(customer);
			list.add(ac);
		}
		return list;
		},accountNumber);
	}
	
	

	
}
