package com.Flipkart;

import java.util.Arrays;
import java.util.Scanner;

public class FlipKart {
	private int productId;
	private String productName;
	private int quantity;
	private double price;
	
	public FlipKart()
	{
		
	}

	public FlipKart(int productId, String productName, int quantity, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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
		return "FlipKart [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
	public void insert(FlipKart[] pro, Scanner sc)
	{
		for(int i=0; i<pro.length; i++)
		{
			System.out.print("Enter the product Id["+(i+1)+"]: ");
			this.productId =  sc.nextInt();
			System.out.print("Enter the product Name["+(i+1)+"]: ");
			this.productName =  sc.next();
			System.out.print("Enter the product Quantity["+(i+1)+"]: ");
			this.quantity=  sc.nextInt();
			System.out.print("Enter the product price["+(i+1)+"]: ");
			this.price =  sc.nextDouble();
			System.out.println();
			
			pro[i] = new FlipKart(productId,productName,quantity,price);
		}
	}

	public void print(FlipKart []pro)
	{
		for(FlipKart f:pro)
		{
			System.out.println(f);
		}
//		System.out.println(Arrays.toString(pro));
	}
	
	public FlipKart[] requirement(FlipKart []pro)
	{
		double amount = 0; int c=0;
		for(int i=0; i<pro.length; i++)
		{
			amount = pro[i].price*pro[i].quantity;
			if(amount>5000)
			{
				c++;
			}
		}
		FlipKart[] f = new FlipKart[c];
		for(int i=0; i<f.length; i++)
		{
			amount = pro[i].price*pro[i].quantity;
			if(amount>5000)
			{
				f[i]=pro[i];
			}
		}
		return f;
	}
}
