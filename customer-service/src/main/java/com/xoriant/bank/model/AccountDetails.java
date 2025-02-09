package com.xoriant.bank.model;

public class AccountDetails {

	private int accountNumber;
	
	private double balance;
	
	
	private Branch branch;
	
	private String accountType;
	
	private Customer customer;
	
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public AccountDetails(int accountNumber, double balance, Branch branch, String accountType,
			Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.branch = branch;
		this.accountType = accountType;
		this.customer = customer;
	}

	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", balance=" + balance
				+ ", branch=" + branch + ", accountType=" + accountType + ", customer=" + customer + "]";
	}
}
