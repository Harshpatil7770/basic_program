package com.xoriant.bank.dao.util;

public class DBquries {

	public static final String ADD_NEW_BRANCH="insert into branch values(?,?,?,?,?)";
	
	public static final String ADD_NEW_PERSON="insert into personInfo values(?,?,?,?,?,?,?,?)";
	
	public static final String ADD_NEW_ADDRESS="insert into address values(?,?,?,?,?,?,?,?,?)";
	
	public static final String ADD_NEW_CUSTOMER="insert into customer values(?,?)";
	
	public static final String UPDATE_CUSTOMER="update personInfo set person_name=?,dob=?,phone_number=? select person_id=(person_id from customer where customer_id=?)";
	
}
