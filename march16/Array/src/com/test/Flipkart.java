package com.test;

import java.util.Scanner;

public class Flipkart {
	private String productName;
	private int quantity;
	private double price;

	public Flipkart(String productName, int quantity, double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public Flipkart() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flipkart [productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	public void insert(Flipkart[] products,Scanner sc)
	{
		for(int i=0; i<products.length; i++)
		{
			System.out.print("Enter the Product Name: ["+i+"]: ");
			this.productName = sc.next();
			System.out.print("Enter the Quantity: ["+i+"]: ");
			this.quantity = sc.nextInt();
			System.out.print("Enter the Price: ["+i+"]: ");
			this.price = sc.nextDouble();
			
			System.out.println("");
			products[i]= new Flipkart(productName, quantity, price);
		}
	}
	
	public void print(Flipkart [] products)
	{
		for(Flipkart f : products)
		{
			System.out.println(f.toString());
		}
	}
	
	public Flipkart[] requirement(Flipkart [] products)
	{
		double amount = 0;int count = 0;
		for(int i=0; i<products.length; i++) {
			amount = products[i].price;
			if(amount>5000)
			{
				count++;
			}
		}
		int temp=0;
		Flipkart pro []= new Flipkart[count];
		
		for(int i=0; i<products.length; i++) {
			amount = products[i].price;
			if(amount>5000)
			{
				pro[temp]=products[i];
				temp++;
			}
		}
		return pro;
		
	}
	
}
