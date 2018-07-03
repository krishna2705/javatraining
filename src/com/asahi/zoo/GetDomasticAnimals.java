package com.asahi.zoo;

import java.util.ArrayList;

public class GetDomasticAnimals implements ZooInterface{

	@Override
	public ArrayList animalsAction(DomasticAnimals domasticAnimals, ArrayList actions) {
		
		ArrayList animalsAction = null;
		
		if(domasticAnimals instanceof Cat) {
			System.out.println("Cat class access");
			
		}else if(domasticAnimals instanceof Cow) {
		   
			System.out.println("Cow class access");
			
		}else if(domasticAnimals instanceof Dog) {
		
			System.out.println("Dog class access");
			
		}else if(domasticAnimals instanceof Goat) {
			
			System.out.println("Goat class access");
		}
		
		return animalsAction;
	}
}
