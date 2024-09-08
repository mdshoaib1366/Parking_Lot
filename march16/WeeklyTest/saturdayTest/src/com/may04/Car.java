package com.may04;

public class Car implements Vehicle{

	private boolean isRented;
	private double retalRate;
	private int rentedDays;
	
	@Override
	public double rent() {
		
		return 1000;
	}

	@Override
	public boolean returnVehicle() {
		
		return isRented;
	}

	@Override
	public double calculateRentalCost() {
		double cost = retalRate*rentedDays;
		return cost;
	}

	public Car() {
		super();
		  isRented = false;
		  retalRate = 1000;
		  rentedDays = 0;
	}

	public boolean isRented(boolean r) {
		return r;
	}

	public double getRetalRate() {
		return calculateRentalCost();
	}

	public int getRentedDays() {
		return rentedDays;
	}

	public void setRent()
	{
		System.out.println(rent());
	}
	
	
	void setRentedDays(int rentedDays)
	{
		this.rentedDays = rentedDays;
	}
	
	
}
