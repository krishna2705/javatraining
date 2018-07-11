package com.asahi.zoo.pti;

public abstract class Mammal extends Animal implements Swimmer {

	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}
	
	public void jump() {
		System.out.println(" jump...");
	}
	
	
	
	public boolean isDomestic() { return false;}

}
