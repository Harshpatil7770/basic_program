package com.xoriant.bank.dao.util;

public class DBquries {

	public static final String CHANGE_PASSWORD="select u.user_name,u.password,u.security_question,u.security_answer from user_login_details u join customer c on u.customer_id=c.customer_id where u.customer_id=?";

	public static final String UPDATE_PASSWORD="update user_login_details set password=? where customer_id?";
}
