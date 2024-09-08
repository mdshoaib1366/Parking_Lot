package com.p1;

public class Program1 {
	public static void badMethod()
	{
		throw new Error();
	}
	public static void main(String[] args) {
		try
		{
			badMethod();
			System.out.print("A");
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.print("B");
		}
		finally {
			System.out.print("C");
		}
		System.out.println("D");
	}
}
