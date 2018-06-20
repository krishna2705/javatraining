package com.asahi.interfacedemo;

public class ConcreteClass extends AbstractClassA implements A, B{

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass : foo");
		System.out.println(B.VAL);
	}
	

}
