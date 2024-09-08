package com.shoaib.relation;

public class Car {
	public int chasisNumber;
	public int seats;
	public String brand;
	public double price;
	private final Engine engine;

	public Car(int chasisNumber, int seats, String brand, double price) {
		super();
		this.chasisNumber = chasisNumber;
		this.seats = seats;
		this.brand = brand;
		this.price = price;
		this.engine = new Engine(123,"Petro",9);
	}

	@Override
	public String toString() {
		return "Car [chasisNumber=" + chasisNumber + ", seats=" + seats + ", brand=" + brand + ", price=" + price
				+" engine= " +engine+"]";
	}

	
}
