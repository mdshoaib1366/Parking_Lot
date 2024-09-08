package com.task.march25;

public class Car {
	private String brand;
	private String model;
	private int year;
	private Driver driver;

	public Car(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}

	public Car(Car obj)
	{
		this.brand = obj.brand;
		this.model = obj.model;
		this.year  = obj.year;
		this.driver = obj.driver;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void changeDriver(Driver newDriver) {
		this.driver = newDriver;
		
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}
	
	
}
