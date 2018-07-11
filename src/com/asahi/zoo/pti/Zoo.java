package com.asahi.zoo.pti;

import java.util.ArrayList;

public class Zoo {

	public static void feedAnimal(Animal animal){
		animal.eat();	
	}
	
	public static void takeoff(Flyer flyer){
		flyer.fly();
	}
	
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat("Stanley"));
		animals.add(new Dog("Clifford"));
		animals.add(new Bird("Polly"));
		animals.add(new Frog("Frank"));
		
		for(int i = 0; i < animals.size(); i++){
			Animal animal = animals.get(i);
			feedAnimal(animal);
		}
		
		System.out.println("----------------");
		ArrayList<Bird> birds = new ArrayList<Bird>();
		birds.add(new Cardina("Cardina"));
		birds.add(new BlueJay("BlueJay"));
		birds.add(new Penguin("Penguin"));
		
		for(int i = 0; i < birds.size(); i++){
			Bird bird = birds.get(i);
			bird.printName();
			if(bird.canFly()) {
				System.out.println(" I can fly");
			}else {
				System.out.println(" I cannot fly");
			}
			
		}
		
		Fish df = new DolphinFish("Dolphin");
		Fish sf = new StarFish("StarFish");
		
		df.swim();
		sf.swim();
		
		df.breath();
		
		df.jump();
		sf.jump();
		
	}

}
