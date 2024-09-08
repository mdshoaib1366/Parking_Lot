package com.inheritance.april5;

public class OnlineShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics e = new Electronics("Fan", 2300.5, "Usha");
		System.out.println(e.displayInfo());
		System.out.println(e.calculateTotalCost(2));
		
		Clothing c = new Clothing("Clothes", 5000.5, "30");
		System.out.println(c.displayInfo());
		System.out.println(c.calculateTotalCost(2));
	}

}
