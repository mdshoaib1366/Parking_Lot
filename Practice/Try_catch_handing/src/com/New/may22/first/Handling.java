package com.New.may22.first;

public class Handling {
	public static void nit(int a)
	{
		try {
			System.out.println("Nareshit");
			nit1(a);
			System.out.println("I");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void nit1(int a) throws ArithmeticException
	{
		try {
		int x = 10/a;
		System.out.println("Completed");
		}
		finally {
			System.out.println("finally");
			
		}
	}
}
