package com.test;

import java.util.Scanner;

public class DemoFlipkart {
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		Flipkart [] products = new Flipkart[size];
		f.insert(products,sc);
		f.print(products);
		
		Flipkart[] result = f.requirement(products);
		System.out.println();
		for(Flipkart res:result)
		{
			System.out.println(res.toString());
		}
	}
}
