package com.inheritance.april5;

public class Product {
	protected String name;
	protected double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String displayInfo()
	{
		return "Product Name: "+name+" ,Product Price: "+price;
	}
	
	public double calculateTotalCost(int quantity) 
	{
		double totalCost = this.price * quantity;
		return totalCost;
	}
}
