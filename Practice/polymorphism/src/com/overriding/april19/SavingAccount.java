package com.overriding.april19;

public class SavingAccount extends Account {

	double interestRate;

	public SavingAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	@Override
	public SavingAccount generateStatement()
	{
		System.out.println(toString());
		return new SavingAccount(super.accountNumber,super.balance,this.interestRate);
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}

	
}
