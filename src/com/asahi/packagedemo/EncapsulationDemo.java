package com.asahi.packagedemo;

public class EncapsulationDemo {
	
	public int id;
	public String name;
	public String address;
	
	public void setStudentInfo(int sId, String name, String address) { //Local variables 
		
		this.id = sId;
		this.name = name;
		this.address = address;
	}
	
	public String getStudentInfo() {
		return this.name +" "+ this.address;
	}
	
}
