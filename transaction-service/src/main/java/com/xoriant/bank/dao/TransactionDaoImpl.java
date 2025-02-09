package com.xoriant.bank.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.export.wavefront.WavefrontProperties.Sender;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.bank.model.TransactionDetails;
import com.xoriant.bank.model.util.CommonMethod;
import com.xoriant.bank.model.util.CustomerDTO;
import com.xoriant.bank.model.util.DBquries;
import com.xoriant.bank.model.util.DTO;
import com.xoriant.bank.resource.MailSender;


@Repository
public class TransactionDaoImpl implements TransactionDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	MailSender sender;
	
	public  String DETAILS_ARE_INVALIED="Details are Invalied";
	
	
	@Override
	public String withdrawMoney(CustomerDTO customerDTO) {
		DTO dto=DTO.getData(customerDTO.getAccountNumber(),jdbcTemplate);
		
		int balance=(int) dto.getAmount();
		int remainingAmount=0;
		
		if(balance>customerDTO.getAmount()) {
		int result=jdbcTemplate.update(DBquries.WITHDRAWAL_MONEY,CommonMethod.getTransactionId(),
				customerDTO.getAmount(),CommonMethod.getCurrentDate(),customerDTO.getAccountNumber(),
				customerDTO.getDescription(),customerDTO.getPayeesAccountNumber(),customerDTO.getTransactionType(),
				customerDTO.getAccountType());
		
		remainingAmount=(int) (balance-customerDTO.getAmount());
		
		int n=jdbcTemplate.update(DBquries.UPDATE_ACCOUNT_BALANCE,remainingAmount,customerDTO.getAccountNumber());
		
		if(n!=0) {
			sender.sendWithdrawDetails(remainingAmount, balance);
			String msg=customerDTO.getAmount()+"Amount Debited from your account, reamining balance is "+remainingAmount;
			return msg;
		}
		}
		
		
		return DETAILS_ARE_INVALIED;
	}


	@Override
	public String depositeMoney(CustomerDTO customerDTO) {
		DTO dto=DTO.getData(customerDTO.getAccountNumber(), jdbcTemplate);
		
		int balance=(int) dto.getAmount();
			
		if(balance>customerDTO.getAmount())
		{
		int result=jdbcTemplate.update(DBquries.DEPOSITE_MONEY,CommonMethod.getTransactionId(),customerDTO.getAmount(),
				CommonMethod.getCurrentDate(),customerDTO.getAccountNumber(),customerDTO.getDescription(),
				customerDTO.getPayeesAccountNumber(),customerDTO.getTransactionType(),customerDTO.getAccountType());
		
		int newBalance=(int) (balance+customerDTO.getAmount());
	
		int n=jdbcTemplate.update(DBquries.UPDATE_ACCOUNT_BALANCE,newBalance,customerDTO.getAccountNumber());
		
		if(n!=0) {
			sender.sendDepositeDetails(customerDTO.getAmount(), balance);
		String msg=customerDTO.getAmount()+"Amount deposited in your account,and new balance is"+newBalance;
		return msg;
	}
		}
		return DETAILS_ARE_INVALIED;

}


	@Override
	public List<TransactionDetails> miniStatement(int accountNumber) {
		
		return jdbcTemplate.query(DBquries.MINI_STATEMENT,(ResultSet rs)-> {
			List<TransactionDetails> list=new ArrayList<TransactionDetails>();
			while(rs.next()) {
				TransactionDetails trans=new TransactionDetails();
				trans.setTransactionId(rs.getInt("transaction_id"));
				trans.setAmount(rs.getDouble("amount"));
				trans.setTransactionDate(rs.getString("transaction_date"));
				trans.setAccountNumber(rs.getInt("account_number"));
				trans.setDescription(rs.getNString("description"));
				trans.setPayeesAccountNumber(rs.getInt("payees_account_number"));
				trans.setTransactionType(rs.getString("transaction_type"));
				trans.setAccountType(rs.getString("account_type"));
				list.add(trans);
				
			}
		return list;
			
		},accountNumber);
		
	}
	
	public String fundTransfer(CustomerDTO customerDTO) {
		DTO dto=DTO.getData(customerDTO.getAccountNumber(), jdbcTemplate);
		
		int balance=(int) dto.getAmount();
		
		int remainingAmount=0;
		
		if(balance>customerDTO.getAmount()) {
			int result=jdbcTemplate.update(DBquries.WITHDRAWAL_MONEY,CommonMethod.getTransactionId(),
					customerDTO.getAmount(),CommonMethod.getCurrentDate(),customerDTO.getAccountNumber(),
					customerDTO.getDescription(),customerDTO.getPayeesAccountNumber(),customerDTO.getTransactionType(),
					customerDTO.getAccountType());
			
			int newBalance=(int) (balance-customerDTO.getAmount());
			
			int n=jdbcTemplate.update(DBquries.UPDATE_ACCOUNT_BALANCE,newBalance,customerDTO.getAccountNumber());
			if(n!=0) {
				sender.sendFundTransferDetails(remainingAmount, newBalance);
				String msg=customerDTO.getAmount()+" Amount Transfered from your account and remaing balance is"+newBalance;
				return msg;
			}
		}
		return  DETAILS_ARE_INVALIED;
	}


	@Override
	public String checkBalance(int accountNumber) {
		// TODO Auto-generated method stub
		DTO dto=null;
		try {
		 dto=DTO.getData(accountNumber, jdbcTemplate);
		double balance=dto.getAmount();
		
		sender.sendBalanceEnquiryDetails(accountNumber);
		String msg="Your Account Remaining Balance is"+balance;
		return msg;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return DETAILS_ARE_INVALIED;
	}
}
