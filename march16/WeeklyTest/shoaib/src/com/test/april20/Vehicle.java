package com.test.april20;

public class Vehicle {
	private int speed;

	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void speedUp(int speed) {
		this.speed = speed;
		System.out.println("Speed incresing...");
		System.out.println(speed);
	}
	
	
}
