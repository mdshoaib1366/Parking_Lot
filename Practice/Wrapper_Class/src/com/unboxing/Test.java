package com.unboxing;

public class Test {
	public static void main(String[] args) 
	{
		long l = 12; //Widening
		System.out.println(l);

//		Long L = 12;//error

		Long L = 12L; //Now 12 is of Long type
		System.out.println(L);

        
		double d = 12;
		System.out.println(d);

        Double D = 12.0;
		System.out.println(D);


	}
}
