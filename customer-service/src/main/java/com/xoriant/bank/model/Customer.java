package com.xoriant.bank.model;

public class Customer {

	private int customerId;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId) {
		super();
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}
	
	
}
