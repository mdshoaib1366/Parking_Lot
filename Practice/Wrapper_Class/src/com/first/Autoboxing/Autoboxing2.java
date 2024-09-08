package com.first.Autoboxing;

public class Autoboxing2 {
//	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);

		Integer a1 = Integer.valueOf(15);
		Integer a2 = Integer.valueOf(15);
		System.out.println(a1==a2);
	}

}
