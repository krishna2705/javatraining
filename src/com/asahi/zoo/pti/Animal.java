package com.asahi.zoo.pti;

public abstract class Animal {

	private String name;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("My Name is "+name);
	}

	public boolean canFly() { return false; }

	public abstract void eat();
	
	public boolean isDomestic() { return false;}
}
