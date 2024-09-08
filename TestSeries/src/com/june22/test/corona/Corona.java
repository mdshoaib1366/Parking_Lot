package com.june22.test.corona;

class Vacccine extends Thread{
	
	public int age;
	
	public void run()
	{
		System.out.println(this.eligibility());
		this.booking();
		System.out.println(this.status());
	}
	
	public Vacccine(int age) {
		super();
		this.age = age;
	}
	
	public boolean eligibility()
	{
		if(age>18)
		{
			return true;
		}
		return false;
		
	}
	
	public void booking()
	{
		if(eligibility())
		{
			System.out.println("your slot is booked");
		}
		else
		{
			System.out.println("soorry!!!");
		}
	}
	public boolean status()
	{
		if(eligibility())
		{
			return true;
			
		}
		return false;
	}
}

public class Corona {
	public static void main(String[] args) {
		Vacccine v = new Vacccine(19);
		
		v.start();
		
		
	}
}
