package com.asahi.zoo;

import java.util.ArrayList;

public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooInterface domasticAnimals = new GetDomasticAnimals();
		
		DomasticAnimals setAnimalsAction = new Cat();
		
		setAnimalsAction.setActions(domasticAnimals);
		
		ArrayList actions = null; 
		
		actions.add(new String("JUMP"));
		actions.add(new String("RUN"));
		
		setAnimalsAction.animalsAction(actions);
		
	}

}
