package com.june27.task;

import java.util.*;

public class ProductMain {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(113, "Mobile", 2000.20));
		al.add(new Product(111, "Shoes", 1000.50));
		al.add(new Product(112, "Watch", 5000.20));
		al.add(new Product(115, "Bat", 1500.20));
		al.add(new Product(114, "Laptop", 15200.20));
		
		Collections.sort(al);
		System.out.println(al);
		
	}
}
