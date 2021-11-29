package com.xoriant.bank.model;

public class UserLoginDetails {

	private int loginId;
	
	private String userName;
	
	private String password;
	
	private String roleType;
	
	private String sequrityQuestion;
	
	private String sequrityAnswer;
	
	private int managerId;
	
	private int customerId;

	public UserLoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginDetails(int loginId, String userName, String password, String roleType, String sequrityQuestion,
			String sequrityAnswer, int managerId, int customerId) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
		this.roleType = roleType;
		this.sequrityQuestion = sequrityQuestion;
		this.sequrityAnswer = sequrityAnswer;
		this.managerId = managerId;
		this.customerId = customerId;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getSequrityQuestion() {
		return sequrityQuestion;
	}

	public void setSequrityQuestion(String sequrityQuestion) {
		this.sequrityQuestion = sequrityQuestion;
	}

	public String getSequrityAnswer() {
		return sequrityAnswer;
	}

	public void setSequrityAnswer(String sequrityAnswer) {
		this.sequrityAnswer = sequrityAnswer;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "UserLoginDetails [loginId=" + loginId + ", userName=" + userName + ", password=" + password
				+ ", roleType=" + roleType + ", sequrityQuestion=" + sequrityQuestion + ", sequrityAnswer="
				+ sequrityAnswer + ", managerId=" + managerId + ", customerId=" + customerId + "]";
	}
	
}
