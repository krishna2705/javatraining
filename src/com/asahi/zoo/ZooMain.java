package com.asahi.zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooInterface domasticAnimals = new GetDomasticAnimals();
		
		DomasticAnimals setAnimalsAction = new Cat();
		
		setAnimalsAction.setActions(domasticAnimals);
		
		String[] actions = {"run", "jump" };  

	    ArrayList<String> actionsList = new ArrayList(Arrays.asList(actions)); 
		
		setAnimalsAction.animalsAction(actionsList);
		
	}

}
