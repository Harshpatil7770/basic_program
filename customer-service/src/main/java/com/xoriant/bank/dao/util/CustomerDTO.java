package com.xoriant.bank.dao.util;

public class CustomerDTO {

	 public int AccountNumber; 
		
		public String description;
		
		public double amount;
		
		public int customerId;
		
		public String userType;
		
		public String transactionType;
		
		public String accountType;
		
		public String formDate;
		
		public String toDate;
		
		public String payersAccountNumber;
		
		public String payeesAccountNumber;
		
		public String oldPassword;
		
		public String newPassword;

		public CustomerDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public CustomerDTO(int accountNumber, String description, double amount, int customerId, String userType,
				String transactionType, String accountType, String formDate, String toDate, String payersAccountNumber,
				String payeesAccountNumber, String oldPassword, String newPassword) {
			super();
			AccountNumber = accountNumber;
			this.description = description;
			this.amount = amount;
			this.customerId = customerId;
			this.userType = userType;
			this.transactionType = transactionType;
			this.accountType = accountType;
			this.formDate = formDate;
			this.toDate = toDate;
			this.payersAccountNumber = payersAccountNumber;
			this.payeesAccountNumber = payeesAccountNumber;
			this.oldPassword = oldPassword;
			this.newPassword = newPassword;
		}

		public int getAccountNumber() {
			return AccountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			AccountNumber = accountNumber;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
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

		public String getPayersAccountNumber() {
			return payersAccountNumber;
		}

		public void setPayersAccountNumber(String payersAccountNumber) {
			this.payersAccountNumber = payersAccountNumber;
		}

		public String getPayeesAccountNumber() {
			return payeesAccountNumber;
		}

		public void setPayeesAccountNumber(String payeesAccountNumber) {
			this.payeesAccountNumber = payeesAccountNumber;
		}

		public String getOldPassword() {
			return oldPassword;
		}

		public void setOldPassword(String oldPassword) {
			this.oldPassword = oldPassword;
		}

		public String getNewPassword() {
			return newPassword;
		}

		public void setNewPassword(String newPassword) {
			this.newPassword = newPassword;
		}

		@Override
		public String toString() {
			return "CustomerDTO [AccountNumber=" + AccountNumber + ", description=" + description + ", amount=" + amount
					+ ", customerId=" + customerId + ", userType=" + userType + ", transactionType=" + transactionType
					+ ", accountType=" + accountType + ", formDate=" + formDate + ", toDate=" + toDate
					+ ", payersAccountNumber=" + payersAccountNumber + ", payeesAccountNumber=" + payeesAccountNumber
					+ ", oldPassword=" + oldPassword + ", newPassword=" + newPassword + "]";
		}

	
	
	
}
