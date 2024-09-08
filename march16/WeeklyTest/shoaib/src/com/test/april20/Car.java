package com.test.april20;

public class Car extends Vehicle {

	public Car(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speedUp(int speed) {
		
		System.out.println("Car is Speed incresing...");
		System.out.println("Car speed: "+speed+"km");
	}
}
