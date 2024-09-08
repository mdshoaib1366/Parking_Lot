package com.inheritance.april5;

public class Electronics extends Product{

	private String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	
	public String displayInfo()
	{
		return super.displayInfo()+" ,Brand : "+brand;
	}
}
