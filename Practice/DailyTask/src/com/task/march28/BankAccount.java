package com.task.march28;

public class BankAccount {

	private double balance;
	private double interestRate;
	
	{
		this.interestRate = 0.01;
	}
	
	public BankAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println("you can't deposit amount");
		}
		else
		{
			balance += amount;
			System.out.println(balance);
		}
	}
	
	public void withdraw(double amount)
	{
		if(balance<amount)
		{
			System.out.println("you can't withdral amount");
		}
		else
		{
			balance -= amount;
			System.out.println(balance);
		}
	}
	
	public double calculateInterest()
	{
		return (balance*interestRate); 
	}
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(1000, 0.01);
		System.out.print("Deposit: ");
		ba.deposit(2500.0);
		System.out.print("Withdraw: ");
		ba.withdraw(387.0);
		System.out.println("Calculate Interrest: 0"+ba.calculateInterest());
	}

}
