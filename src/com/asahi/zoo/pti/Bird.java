package com.asahi.zoo.pti;

public class Bird extends Animal implements Flyer {

	public Bird(String name) {
		super(name);
	}

	public void fly() {
		System.out.println("flap flap flap");
	}

	public void chirp() {
		System.out.println("Tweet tweet!");
	}

	@Override
	public void eat() {
		System.out.println("I peck at some seeds.");
	}

	public boolean canFly() {
		return true;
	}
}
