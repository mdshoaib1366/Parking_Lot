package com.test.april20;

public class Bike extends Vehicle {

	public Bike(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void speedUp(int speed) {
		
		System.out.println("Bike Speed incresing...");
		System.out.println("Bike speed: "+speed+"km");
	}
}
