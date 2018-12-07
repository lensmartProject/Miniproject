package com.capgemini.lensmart;

public class UserDetails {
	
private	String UserName;
private	String Password;
private	String Name;
private	String Email;
private	int Mob_Number;
private	 String Gender;
private	 String Confirm_Password;
	
	
	

	


	public String getUserName() {
		return UserName;
	}




	public void setUserName(String userName) {
		UserName = userName;
	}




	public String getPassword() {
		return Password;
	}




	public void setPassword(String password) {
		Password = password;
	}




	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public int getMob_Number() {
		return Mob_Number;
	}




	public void setMob_Number(int mob_Number) {
		Mob_Number = mob_Number;
	}




	public String getGender() {
		return Gender;
	}




	public void setGender(String gender) {
		Gender = gender;
	}




	public String getConfirm_Password() {
		return Confirm_Password;
	}




	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}




	public UserDetails(String userName, String password, String name,
			String email, int mob_Number, String gender, String confirm_Password) {
		super();
		UserName = userName;
		Password = password;
		Name = name;
		Email = email;
		Mob_Number = mob_Number;
		Gender = gender;
		Confirm_Password = confirm_Password;
	}

	public UserDetails(){
		
		}




	@Override
	public String toString() {
		return "UserDetails [UserName=" + UserName + ", Password=" + Password
				+ ", Name=" + Name + ", Email=" + Email + ", Mob_Number="
				+ Mob_Number + ", Gender=" + Gender + ", Confirm_Password="
				+ Confirm_Password + "]";
	}

	
	
	
}
