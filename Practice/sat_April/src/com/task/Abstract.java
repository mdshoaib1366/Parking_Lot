package com.task;

class NIT
{
	protected static void nit() 
	{
		System.out.println("NIT");
	}
}

class NIT1 extends NIT
{
	protected static void nit() 
	{
		System.out.println("hiii");
	}
}

public class Abstract extends NIT1{
	
	public static void main(String[] args) {
		nit();
	}
}