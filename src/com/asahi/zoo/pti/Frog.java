package com.asahi.zoo.pti;

public class Frog extends Animal {

	public Frog(String name){
		super(name);	
	}
	
	public void ribbit(){
		System.out.println("Ribbit ribbit.");
	}   
	
	@Override
	public void eat(){
		System.out.println("I crunch up a cricket.");	
	}

}
