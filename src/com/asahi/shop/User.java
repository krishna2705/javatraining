package com.asahi.shop;

public class User {
	
	private long uid;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private char gender;
	private String userType;
	
	public User() {}
	public User(long uid, String uemail, String upwd, String ufname, String ulname, char gender, String utype) {
		this.uid = uid;
		this.email = uemail;
		this.password = upwd;
		this.firstName = ufname;
		this.lastName = ulname;
		this.gender = gender;
		this.userType = utype;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
