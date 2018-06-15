package com.asahi.packagedemo;

public class StaticClassDemo {
	
	//Declare the instance and static variables
	
	//instance variables
	int id;
	String name;
	String address;
	
	//Static variables
	static long accountNumber;
	static String accountName;
	static String ifscCode;
	
	
	//Instance Method
	public void instanceMethod() {
		//Access the instance variables and methods
		this.id = 1000;
		this.name = "krishna";
		this.address = "Karur";
		
		//Access the static variables and methods with in this instance method
		accountNumber = 545545412;
		accountName = "Krishnamoorthy";
		ifscCode = "KKBK1000468";
		//staticMethod(StaticClassDemo s);
	}
	
	//Static Method
	public static void staticMethod(StaticClassDemo s) {
		
		//Access the static variables and methods 
		accountNumber = 435435343;
		accountName = "Krishnamoorthy";
		ifscCode = "KKBK1000468";
		
		System.out.println("Static Method ========= var ==== accountNumber "+ accountNumber);
		System.out.println("Static Method ========= var ==== accountName "+ accountName);
		System.out.println("Static Method ========= var ==== ifscCode "+ ifscCode);
		
		//Access the instance variables and methods with in this instance method
		s.id = 1000;
		s.name = "krishnamoorthy";
		s.address = "Karur";
		s.instanceMethod();
				
	}

}
