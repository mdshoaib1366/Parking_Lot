package com.objectClass_and_its_methods;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1);
	}
}
