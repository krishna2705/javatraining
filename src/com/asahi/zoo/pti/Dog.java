package com.asahi.zoo.pti;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public void bark(){
		System.out.println("Bark bark bark!");
	}
	
	@Override
	public void eat() {
		System.out.println("I chew on a bone.");
	}

}
