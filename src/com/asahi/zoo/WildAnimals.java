package com.asahi.zoo;

import java.util.ArrayList;

public abstract class WildAnimals {
   
	private ZooInterface actions; //Programming through interface

	/**
	 * @return the actions
	 */
	public ZooInterface getActions() {
		return actions;
	}

	/**
	 * @param actions the actions to set
	 */
	public void setActions(ZooInterface actions) {
		this.actions = actions;
	}
}
