package com.generic.test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal
{
	public abstract void checkup();
}
class Dog extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Dog checkup");
	}
	
}
class Cat extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Cat checkup");
	}
	
}
class Bird extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Bird checkup");
	}
	
}
public class Test1 {
	public void checkAnimals(List<? extends Animal> animals)
	{
		for(Animal animal: animals)
		{
			animal.checkup();
		}
	}

	public static void main(String[] args) 
	{
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		
		Test1 t = new Test1();
		t.checkAnimals(dogs);
		t.checkAnimals(cats);
	}

}
