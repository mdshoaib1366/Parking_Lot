package com.task3;

import java.util.Scanner;

public class CarShowRoom {
	private String carName;
	private String carBrand;
	private double carPrice;
	private double rate;
	private long emi;

	public CarShowRoom(String carName, String carBrand, double carPrice, double rate, long emi) {
		super();
		this.carName = carName;
		this.carBrand = carBrand;
		this.carPrice = carPrice;
		this.rate = rate;
		this.emi = emi;
	}

	public CarShowRoom() {
		super();
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public long getEmi() {
		return emi;
	}

	public void setEmi(long emi) {
		this.emi = emi;
	}

	@Override
	public String toString() {
		return "CarShowRoom [carName=" + carName + ", carBrand=" + carBrand + ", carPrice=" + carPrice + ", rate="
				+ rate + ", emi=" + emi + "]";
	}
	
	public void insert(CarShowRoom[] pro,Scanner sc)
	{
		
		for(int i=0; i<pro.length; i++)
		{
			System.out.println("Enter the car Name: ["+i+"]: ");
			this.carName=sc.next();
			System.out.println("Enter the car Brand: ["+i+"]: ");
			this.carBrand=sc.next();
			System.out.println("Enter the car Price: ["+i+"]: ");
			this.carPrice=sc.nextDouble();
			System.out.println("Enter the car Rate: ["+i+"]: ");
			this.rate=sc.nextDouble();
			System.out.println("Enter the car emi: ["+i+"]: ");
			this.emi=sc.nextLong();
			
			System.out.println();
			pro[i]=new CarShowRoom(carName, carBrand, carPrice, rate, emi);
			
		}
	}
	
	public static void print(CarShowRoom []cs)
	{
		for(CarShowRoom i: cs)
		{
			System.out.println(i);
		}
	}
	
	public static CarShowRoom[] requirement(CarShowRoom []cs)
	{
		long eAmount=0;int count=0;
		for(int i=0; i<cs.length;i++)
		{
			eAmount = cs[i].emi;
			if(eAmount<2000 && cs[i].rate>4.0)
			{
				count++;
			}
		}
		int temp=0;
		
		CarShowRoom []pro = new CarShowRoom[count];
		for(int i=0; i<cs.length;i++)
		{
			
			if(eAmount>2000 && pro[i].rate>4.0)
			{
				pro[temp]=cs[i];
				temp++;
			}
		}
		
		return pro;
		
	}
	
}
