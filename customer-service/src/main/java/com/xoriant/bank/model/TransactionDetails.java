package com.xoriant.bank.model;

public class TransactionDetails {

	private int transactionId;
	
	private  double amount;
	
	private  String transactionDate;
	
	private int accountNumber;
	
	private  String description;
	
	private  int payeesAccountNumber;
	
	private  String transactionType;
	
	private int accountType;
	
	private  String formDate;
	
	private  String toDate;

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(int transactionId, double amount, String transactionDate, int accountNumber,
			String description, int payeesAccountNumber, String transactionType, int accountType, String formDate,
			String toDate) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.accountNumber = accountNumber;
		this.description = description;
		this.payeesAccountNumber = payeesAccountNumber;
		this.transactionType = transactionType;
		this.accountType = accountType;
		this.formDate = formDate;
		this.toDate = toDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
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

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public String getFormDate() {
		return formDate;
	}

	public void setFormDate(String formDate) {
		this.formDate = formDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transactionId=" + transactionId + ", amount=" + amount + ", transactionDate="
				+ transactionDate + ", accountNumber=" + accountNumber + ", description=" + description
				+ ", payeesAccountNumber=" + payeesAccountNumber + ", transactionType=" + transactionType
				+ ", accountType=" + accountType + ", formDate=" + formDate + ", toDate=" + toDate + "]";
	}
	
	
}
