package com.capgemini.lensmart;

public class UserDetailsPojo {
	private String fullName;
	private String userName;
	private String password;
	private String confirmPassword;
	private int mobileNum;
	private String emailId;
	private String address;
	
	
	public UserDetailsPojo() {
		
	}
	public UserDetailsPojo(String fullName, String userName, String password,
			String confirmPassword, int mobileNum, String emailId,
			String address) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.mobileNum = mobileNum;
		this.emailId = emailId;
		this.address = address;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public int getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDetailsPojo [fullName=" + fullName + ", userName="
				+ userName + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", mobileNum=" + mobileNum + ", emailId="
				+ emailId + ", address=" + address + "]";
	}
	/*public static  void userVerify(String fullName, String userName,
			String password, String confirmPassword, int mobileNum,
			String emailId, String address) {
		
		fullName = fullName;
		userName = userName;
		password = password;
		confirmPassword = confirmPassword;
		mobileNum = mobileNum;
		emailId = emailId;
		address = address;
		
		
	}*/
	
	
	

}