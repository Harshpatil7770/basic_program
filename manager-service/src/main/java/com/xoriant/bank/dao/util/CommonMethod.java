package com.xoriant.bank.dao.util;

public class CommonMethod {

	public static String BRANCHID;
	public static String PERSONID;
	public static String ADDRESSID;
	public static String CUSTOMERID;
	
	public static int getBranchId() {
		String str="99";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		BRANCHID=str;
		return Integer.parseInt(BRANCHID);
	}
	
	public static int getPersonId() {
		String str="100";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		PERSONID=str;
		return Integer.parseInt(PERSONID);
	}
	
	public static int getAddressId() {
		String str="200";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		ADDRESSID=str;
		return Integer.parseInt(ADDRESSID);
	}
	
	
	public static int getCustomerId() {
		String str="200";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		CUSTOMERID=str;
		return Integer.parseInt(CUSTOMERID);
	}
	
}
