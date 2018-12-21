package com.project.pojo;

public class User {
	
	private String emailId;
	private int userId;
	private String name;
	private int phoneNo;
	private String password;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String emailId, int userId, String name, int phoneNo, String password) {
		super();
		this.emailId = emailId;
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", userId=" + userId + ", name=" + name + ", phoneNo=" + phoneNo
				+ ", password=" + password + "]";
	}
	
	
	
}
