package com.task.march28;

public class Car {

	private String make;
	private String model;
	private int year;
	
	{
		this.make = null;
		this.model = null;
		this.year = 0;
	}
	
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getDescription() 
	{
		return "{"+this.make+"} {"+this.model+"} ({"+this.year+"})";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("KIA", "SELTOS", 2023);
		
		System.out.println(c.getDescription());
	}

}
