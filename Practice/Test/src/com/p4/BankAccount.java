package com.p4;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void deposit(int amount) throws BankOperationException
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("balance(d): "+balance);
		}
		else
		{
			throw new BankOperationException("Deposit amount cannot be negative.");
		}
	}
	public void withdraw(int amount) throws BankOperationException
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("balance(w): "+balance);
		}
		else
		{
			throw new BankOperationException("Insufficient funds for withdrawal");
		}
		
	}

	public double getBalance() {
		return balance;
	}

	
}
