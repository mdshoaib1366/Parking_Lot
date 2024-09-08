package com.shoaib.dataHiding;

public class Customer {
	protected double balance = 1000;
	
	public void deposit(int depositAmount)
	{
		if(depositAmount<=0)
		{
			System.out.println("you can't be deposited");
		}
		else 
		{
			balance = balance + depositAmount;
			System.out.println("Amount after deposit: "+balance);
		}
	}
	
	public void withdraw (int withdrawalAmount)
	{
		if(withdrawalAmount>balance){
			System.out.println("you can't be withdraw amount");
		}
		else
		{
			balance = balance - withdrawalAmount;
			System.out.println("Amount after withdrawal: "+balance);
		}
	}
}
