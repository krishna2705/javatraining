package com.asahi.packagedemo;

public class ConcreteSubClass extends AbstractSubClass {

	@Override
	void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3()");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Super class : test2()");
	}
	
	public static void main(String[] args) {
		ConcreteSubClass concrete = new ConcreteSubClass();
		concrete.test1();
		concrete.test2();
		concrete.test3();
	}

}
