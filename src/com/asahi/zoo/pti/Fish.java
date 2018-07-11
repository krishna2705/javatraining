package com.asahi.zoo.pti;

public abstract class Fish extends Mammal {

	private String name;
	public Fish(String name) {
		
		super(name);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println(" My name is "+name+" I am a swimmer ...");

	}

	public void breath() {
		System.out.println(" I can breath in water");
	}
}
