package com.may04;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.isRented(true));
		c.setRentedDays(4);
		System.out.println(c.calculateRentalCost());
		System.out.println(c.isRented(false));
	}

}
