package com.task2.april25;

public class Account {
	public Customer cust;
	public long accountNumber;
	public double balance;
	public float interestRate;

	public Account(Customer cust, long accountNumber, double balance, float interestRate) {
		super();
		this.cust = cust;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void deposit(int amount)
	{
		if(amount >= 0) {
		balance = balance + amount;
		System.out.println("Your deposited amount: "+balance);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	public double withdraw(int amount)
	{
		if(balance >= amount)
		{
			balance = balance - amount;
			return balance;
		}
		else 
		{
			System.out.println("Invlid ");
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Account [cust=" + cust + ", accountNumber=" + accountNumber + ", balance=" + balance + ", interestRate="
				+ interestRate + "]";
	}
	
	
	
}
