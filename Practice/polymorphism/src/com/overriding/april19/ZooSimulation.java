package com.overriding.april19;

public class ZooSimulation {
	public static void main(String[] args) {
		Animal m = new Mammal("Lion",true);  //up casting
		m.makeSound();
		m.toString();
		m.reproduce();
		Mammal m1 = (Mammal) m; // down casting
		m1.nurseYoung();
		System.out.println("===================================");
		
		Animal b = new Bird("Eagle",true);
		b.makeSound();
		b.toString();
		b.reproduce();
		Bird b1 = (Bird)b;
		b1.buildNest();
		
		
		
		
	}
}



