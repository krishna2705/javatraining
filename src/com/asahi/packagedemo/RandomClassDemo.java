package com.asahi.packagedemo;

public class RandomClassDemo {
	  
	  
	private static RandomClassDemo instance;

	public static RandomClassDemo getInstance() {
		if(instance == null) {
		   instance = new RandomClassDemo();
		}    
		return instance;
	}

	 /*public static void setInstance(RandomClassDemo instance) {
		RandomClassDemo.instance = instance;
	 }*/
	  	  
	  /*private RandomClassDemo() {
	    
	  }
	  
	  public static RandomClassDemo method() {
	    
	    if(instance == null) {
	      instance = new RandomClassDemo();
	    }
	    
	    return instance;
	  }*/
	}
