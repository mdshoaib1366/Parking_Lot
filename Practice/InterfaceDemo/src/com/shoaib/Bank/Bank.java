package com.shoaib.Bank;

public interface Bank {
	void withdraw(int amount);
	void deposit(int amount);
	
}

class Banks implements Bank
{
	String name;
	int balance;
	
	
	public Banks(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance)
		{
			balance = balance - amount;
			System.out.println("Amount Withdrawl: "+balance);
		}
		else
		{
			System.out.println("You can't withdraw the money.");
		}
		
	}

	@Override
	public void deposit(int amount) {
		if(amount>0) 
		{
			balance = balance + amount;
			System.out.println("Amount Deposit: "+balance);

		}
		else
		{
			System.out.println("sorry! you can't deposit the money.");
		}
		
	}
	
}
