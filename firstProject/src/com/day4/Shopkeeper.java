package com.day4;

public class Shopkeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bTv = 32500;
		double profit = bTv*27/100;
		System.out.println("profit: "+profit);
		double vat = bTv*12.7/100;
		System.out.println("Vat: "+vat);
		double sCharge = bTv*3.8/100;
		System.out.println("Service Charge: "+sCharge);
		System.out.println("Total selling price: "+(bTv+profit-vat-sCharge));
	}

}
