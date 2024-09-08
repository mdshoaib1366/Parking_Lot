package com.day4;

public class Principal {
	public static void main(String[] args) {
		double p = Double.parseDouble(args[0]);
		int r = Integer.parseInt(args[1]);
		int t = Integer.parseInt(args[2]);
		
		double s = (p*r*t)/100;
		System.out.println("Simple Interest: "+s);
		System.out.println("Amount: "+(p+s));
		
	}
}
