package com.task.march25;

public class CarDemo {

	public static void main(String[] args) {
		
		Driver d1 = new Driver("A", 23);
		
		Car c1 = new Car("tata", "punch", 2023, d1);
		Car c2 = new Car(c1);
	
		System.out.println(c1);
		System.out.println(c2);
		Driver d2 = new Driver("B", 34);
		c1.changeDriver(d2);
		System.out.println(c1);
		System.out.println(c2);

		
	}

}
