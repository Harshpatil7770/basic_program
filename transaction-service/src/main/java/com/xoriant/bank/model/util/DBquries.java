package com.xoriant.bank.model.util;

public class DBquries {

	public static final String WITHDRAWAL_MONEY = "insert into transaction_details values(?,?,?,?,?,?,?,?)";

	public static final String ACCOUNT_DETAILS = "select balance,branch_id,account_type,person_type,role from account_details ac inner join customer c on ac.customer_id=c.customer_id inner join personinfo p on p.person_id=c.person_id where account_number=?";

	public static final String UPDATE_ACCOUNT_BALANCE = "update account_details set balance=? where account_number=?";

	public static final String DEPOSITE_MONEY = "insert into transaction_details values(?,?,?,?,?,?,?,?)";

	public static final String MINI_STATEMENT = "select * from transaction_details where account_number=? order by transaction_id desc limit 5";

	public static final String CHECK_BALANCE="select balance from account_details where account_number=?";
}
