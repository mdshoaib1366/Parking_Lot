package com.shoaib.first;
//9,90,000 at fixed rate 4.9%

public class IncomeTax {
	public static void main(String[] args) {
		double income = 990000;
		double tax = 0;
		double original;
		tax = (income*4.9/100);
		original = income - tax;
		System.out.println("Tax: "+tax);
		System.out.println("Actual income: "+original);
	}
}
