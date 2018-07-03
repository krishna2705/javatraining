package com.asahi.zoo;

import java.util.ArrayList;

public class Goat extends DomasticAnimals{
   
	@Override
	public ArrayList animalsAction(ArrayList actions){
		return getActions().animalsAction(this, actions);
	}
	
}
