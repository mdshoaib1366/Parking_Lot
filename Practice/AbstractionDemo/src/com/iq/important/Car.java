package com.iq.important;

public abstract class Car {
	public abstract void run();
	
	int speed = 200;
	
	public Car()
	{
		System.out.println("Car Class Constructor....");
	}
	public void getdetails()
	{
		System.out.println("It has four Wheels");
	}
}


