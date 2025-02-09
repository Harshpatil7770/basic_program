package com.xoriant.bank.model;

public class PersonInfo {
	
	private int personId;

	private String personName;
	
	private String dob;
	
	private String phoneNumber;
	
	private String personType;
	
	private String role;
	
	private String gender;
	
	private Address address;

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(int personId, String personName, String dob, String phoneNumber, String personType, String role,
			String gender, Address address) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.personType = personType;
		this.role = role;
		this.gender = gender;
		this.address = address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PersonInfo [personId=" + personId + ", personName=" + personName + ", dob=" + dob + ", phoneNumber="
				+ phoneNumber + ", personType=" + personType + ", role=" + role + ", gender=" + gender + ", address="
				+ address + "]";
	}

	
	
}
