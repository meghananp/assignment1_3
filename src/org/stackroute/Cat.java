package org.stackroute;

public class Cat extends Animal implements AnimalNew {
	
	int speed=20;
	
	public void eat(){
		System.out.println("Loves fish");
	}
	
	public void sound(){
		System.out.println("Meow");
	}
	
	public void eatOne(){
		System.out.println("Eats a lot");
	}

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		
	}

}
