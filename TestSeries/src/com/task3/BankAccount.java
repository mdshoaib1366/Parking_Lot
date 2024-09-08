package com.task3;

public abstract class BankAccount {
	private String accountNumber;
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(int amount)
	{
		if(amount<0)
		{
			System.out.println("Sorry! you can't withdraw Amount.");
		}
		else
		{
			double money = balance + amount;
			System.out.println("Deposit Money: "+money);
		}
		
	}
	
	abstract void withdraw(int amount);
	abstract String accountType();
}
