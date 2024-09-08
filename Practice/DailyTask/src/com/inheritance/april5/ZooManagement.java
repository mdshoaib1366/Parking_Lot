package com.inheritance.april5;

public class ZooManagement {

	public static void main(String[] args) {
		Lion lion = new Lion("Sheru", 46, 12);
//		lion.displayInfo();
		lion.displayManeLength();
		lion.makeSound();
		System.out.println("=====================================================");
		
		Elephant elephant = new Elephant("Golu", 60, 10.4f);
		elephant.displayTuskLength();
		elephant.makeSound();
	}
}
