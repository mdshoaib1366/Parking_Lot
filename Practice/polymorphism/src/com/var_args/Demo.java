package com.var_args;

public class Demo {
	public static void m1(int x)
	{
		System.out.println("A");
	}
	public static void m1(int... y)
	{
		System.out.println("B");
	}
	public static void main(String[] args) {
		
		m1();
	}

}
