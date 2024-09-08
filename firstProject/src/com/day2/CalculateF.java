package com.day2;

public class CalculateF {
	public static void main(String[] args) {
		double f = Double.parseDouble(args[0]);
		double c = ((f-32)*5)/9;
		System.out.println("Celsius: "+c);
	}
}
