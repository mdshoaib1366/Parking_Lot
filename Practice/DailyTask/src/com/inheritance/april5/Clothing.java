package com.inheritance.april5;

public class Clothing extends Product{
	private String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
	public String displayInfo()
	{
		return super.displayInfo()+" ,Size: "+size;
	}
	
}
