package com.demo.final_key;

public class ProductEquality {
	public static void main(String[] args) {
		Product  p1 = new Product(123,"Ifone");
		
		Product  p2 = new Product(126,"Ifone");
		
		
		System.out.println(p1.equals(p2));
	}
}
