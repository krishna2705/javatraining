package com.asahi.zoo.pti;

public class Cat extends Animal {

	public Cat(String name){
		super(name);	
	}
	
	public void meow(){
		System.out.println("Meow!");
	}
	
	public void eat(){
		System.out.println("That mouse was delicious!");	
	}

}
