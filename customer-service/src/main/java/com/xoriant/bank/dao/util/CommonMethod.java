package com.xoriant.bank.dao.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CommonMethod {

	public static String ADDRESSID;
	public static String TRANSACTIONID;
	public static String CURRENTDATE;
	public static String CUSTOMERID;
    public static String MANAGERID;
	public static String PERSONID;
	
	public static String getAddressId() {
		String str="900";
		int random=(int) (Math.random()*(1000-100+1)+100);
		str=str+Integer.toString(random);
		return str;
	}
	
	public static String getTransactionId() {
		String str="1000";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		return str;
	}
	public static String getCurrentDate() {
		String str="";
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		  str=dtf.format(now);
		   return str;
		   
	}
	
	public static String getCustomerId() {
		String str="9009";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		CUSTOMERID=str;
		return str;
	}
	
	public static String getManagerId() {
		String str="1010";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		str=MANAGERID;
		return str;
	}
	
	public static String personId() {
		String str="2020";
		int random=(int) (Math.random()*(1000-100+1)-100);
		str=str+Integer.toString(random);
		str=PERSONID;
		return str;
	}
}
