package com.xoriant.bank.model.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class CommonMethod {

	private static String TRANSACTIONID;
	private static String CURRENTDATE;
	
	public static  int getTransactionId() {
		String str="10000";
		
		int random=(int) (Math.random()*(1000-100+1)+100);
		str=str+Integer.toString(random);
		TRANSACTIONID=str;
		return Integer.parseInt(TRANSACTIONID);
	}
	
	public static String getCurrentDate() {
		String str="";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		str=dtf.format(now);
		return str;
	}
	
}
