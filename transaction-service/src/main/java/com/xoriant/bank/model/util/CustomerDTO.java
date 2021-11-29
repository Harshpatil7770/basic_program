package com.xoriant.bank.model.util;

public class CustomerDTO {

	private int customerId;
	
	private double amount;
	
	private String transactionDate;
	
	private int accountNumber;
	
	private String description;
	
	private int payeesAccountNumber;
	
	private String transactionType;
	
	private String accountType;
	
	private String fromDate;
	
	private String toDate;
	
	private String userType;

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(int customerId, double amount, String transactionDate, int accountNumber, String description,
			int payeesAccountNumber, String transactionType, String accountType, String fromDate, String toDate,
			String userType) {
		super();
		this.customerId = customerId;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.accountNumber = accountNumber;
		this.description = description;
		this.payeesAccountNumber = payeesAccountNumber;
		this.transactionType = transactionType;
		this.accountType = accountType;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.userType = userType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPayeesAccountNumber() {
		return payeesAccountNumber;
	}

	public void setPayeesAccountNumber(int payeesAccountNumber) {
		this.payeesAccountNumber = payeesAccountNumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", amount=" + amount + ", transactionDate=" + transactionDate
				+ ", accountNumber=" + accountNumber + ", description=" + description + ", payeesAccountNumber="
				+ payeesAccountNumber + ", transactionType=" + transactionType + ", accountType=" + accountType
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", userType=" + userType + "]";
	}
//	/*public static CustomerDTO getData(int accountNumber,JdbcTemplate jdbcTemplate) {
//		return jdbcTemplate.query(DBquries.ACCOUNT_DETAILS,(ResultSet rs)->{
//			if(rs.next()) {
//				CustomerDTO dto=new CustomerDTO();
//				
//
//				dto.setAmount(rs.getDouble("balance"));
//				return dto;
//			}
//			return null;
//		
//		},accountNumber);
//		*/
//	}
	
}
