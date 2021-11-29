package com.xoriant.bank.model;

public class Branch {

	private int branchId;
	
	private String branchName;
	
	private int ifscCode;
	
	private int micrCode;
	
	private int managerId;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(int branchId, String branchName, int ifscCode, int micrCode, int managerId) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.micrCode = micrCode;
		this.managerId = managerId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(int micrCode) {
		this.micrCode = micrCode;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", ifscCode=" + ifscCode + ", micrCode="
				+ micrCode + ", managerId=" + managerId + "]";
	}
	
	
}
