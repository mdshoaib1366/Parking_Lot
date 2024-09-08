package com.demos;

public class StringComparison 
{
	public static void main(String[] args) 
	{
		Integer i1 = 128;
		Integer i2 = 128;
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(i1==i2);
		
		
	}
}
