package com.first.Autoboxing;

public class Autoboxing {
	public static void main(String[] args) {
//		int i =  34;
//		String s = Integer.toString(i);
//		System.out.println(s+2);
		
		//AUTOBOXING
		int i = 23;
//		Integer v = Integer.valueOf(i);
		Integer v = i;
		System.out.println(v);
		
		//UNBOXING	
		Integer x = 3345;
//		int y = x.intValue();
		int y = x;
		System.out.println(y);
	}
}
