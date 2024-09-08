package com.iq.important;

public class AbstractIq {

	public static void main(String[] args) {
		Car car = new Honda();
		System.out.println(car.speed);
		car.run();
		car.getdetails();
//		System.out.println(car.equals(car));
		System.out.println(car.getClass());
	}

}
