package com.day2;

public class Salary {
	public static void main(String[] args) {
		int sal = Integer.parseInt(args[0]);
		System.out.println("Basic Salary: "+sal);
		int hra = sal*15/100;
		System.out.println("HRA: "+hra);
		int ca = sal*15/100;
		System.out.println("Conveyance allowance: "+ca);
		int ea = sal*10/100;
		System.out.println("Entertainment allowance: "+ea);
//		int total = sal + hra + ca + ea;
		
		System.out.println("Total Salary: "+(sal + hra + ca + ea));
		
	}
}
