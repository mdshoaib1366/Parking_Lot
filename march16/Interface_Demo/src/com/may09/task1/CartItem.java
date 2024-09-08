package com.may09.task1;

public class CartItem{

	private String name;
	private double price;
	private int quantity;

	public CartItem(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}


	public double getTotalPrice() {
		double tbill = this.quantity*this.price;
		return tbill;
	}

	
}
