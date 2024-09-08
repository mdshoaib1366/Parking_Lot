package com.inheritance.april5;

public class Lion extends Animal {

	private int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		this.maneLength = maneLength;
	}

	public void makeSound()
	{
		System.out.println("The lion roars loudly.");
	}
	
	public void displayManeLength()
	{
		System.out.println(super.toString()+"Mane Length"+maneLength);
	}

	
}
