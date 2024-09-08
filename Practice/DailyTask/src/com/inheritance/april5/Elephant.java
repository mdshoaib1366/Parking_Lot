package com.inheritance.april5;

public class Elephant extends Animal {
	private float tuskLength;

	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		this.tuskLength = tuskLength;
	}

	public void makeSound()
	{
		System.out.println("The elephant trumpets.");
	}
	public void displayTuskLength() 
	{
		System.out.println(super.toString()+"Tusk Length: "+tuskLength);
	}
}
