package com.xoriant.bank.dao.util;

import java.sql.ResultSet;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDTO {

	public  String userName;
	
	public String oldPassword;
	
	public String password;
	
	public String newPassword;
	
	public String securityQuestion;
	
	public String securityAnswer;
	
	public int customerId;

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

    public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public UserDTO(String userName, String oldPassword, String password, String newPassword, String securityQuestion,
			String securityAnswer, int customerId) {
		super();
		this.userName = userName;
		this.oldPassword = oldPassword;
		this.password = password;
		this.newPassword = newPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", oldPassword=" + oldPassword + ", password=" + password
				+ ", newPassword=" + newPassword + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + ", customerId=" + customerId + "]";
	}

	public static UserDTO getUserDetails(int customerId,JdbcTemplate jdbcTemplate) {
		return jdbcTemplate.query(DBquries.CHANGE_PASSWORD,(ResultSet rs)->{
			if(rs.next()) {
				UserDTO obj=new UserDTO();
				obj.setUserName(rs.getString("user_name"));
				obj.setOldPassword(rs.getString("password"));
				obj.setSecurityQuestion(rs.getString("security_question"));
				obj.setSecurityAnswer(rs.getString("security_answer"));
				
				return obj;
				
			}
			return null;
		},customerId);
	
	}
	
	
}
