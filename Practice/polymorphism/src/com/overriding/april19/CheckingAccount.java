package com.overriding.april19;

public class CheckingAccount extends Account {

	double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public CheckingAccount generateStatement()
	{
		System.out.println(toString());
		return new CheckingAccount(super.accountNumber,super.balance,this.overdraftLimit);
	}
	
	@Override
	public String toString() {
		return "CheckingAccount [overdraftLimit=" + overdraftLimit + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}
	
	
}
