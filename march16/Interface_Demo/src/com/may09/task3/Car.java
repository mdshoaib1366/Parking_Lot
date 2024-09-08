package com.may09.task3;

public class Car {
	private String brand;
	private double price;
	private int mileage;

	public Car(String brand, double price, int mileage) {
		super();
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", mileage=" + mileage + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
