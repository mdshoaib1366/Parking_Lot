package com.may03.task;

public class Customer  {

	 String name;
	 double accountBalance;
	
	public Customer(String name, double accountBalance) {
		super();
		this.name = name;
		this.accountBalance = accountBalance;
	}

	public void deposit(Bank b,double amount) {
		b.depositing(this.accountBalance+amount);
	}

	public void withdraw(Bank b,double amount) {
		b.withdrawing(amount);
	}

	public double checkBalance(Bank b) {
		return  b.checking_account_balance();
	}

}
