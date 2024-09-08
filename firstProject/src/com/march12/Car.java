package com.march12;

public class Car {
	String brandName;
	String vehicleNumber;
	int seat;
	int tyre;
	double price;
	
	public void getdata()
	{
		System.out.println("Car Brand : "+brandName);
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Car Price : "+price);
		System.out.println("Seats : "+seat);
		System.out.println("Car Tyre : "+tyre);
	}
	public void startEngine()
	{
		System.out.println("Engine is start...");
	}
	public void accelarate()
	{
		System.out.println("Car is accelareting...");
	}
	public void stopCar()
	{
		System.out.println("Car is Stop...");
	}
	
}
