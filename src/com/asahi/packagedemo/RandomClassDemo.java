package com.asahi.packagedemo;

public class RandomClassDemo {
	  
	  
	private static RandomClassDemo instance;
	
	private RandomClassDemo() {}

	public static RandomClassDemo getInstance() {
		if(instance == null) {
		   instance = new RandomClassDemo();
		}    
		return instance;
	}

}
