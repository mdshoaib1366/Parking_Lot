package com.may03.task;

public class SBI implements Bank {
	
	private double accountBalance;

	@Override
	public void depositing(double amount) {

		if (amount > 0) {
			accountBalance = accountBalance + amount;
			System.out.println("NEW BALANCE(d): " + accountBalance);
		}
		else {
			System.out.println("You can't deposit amount.");
		}
	}

	@Override
	public void withdrawing(double amount) {
		if (amount <= accountBalance) {
			accountBalance = accountBalance - amount;
			System.out.println("NEW BALANCE(w): " + accountBalance);
		}
		else {
			System.out.println("You can't Withdraw amount.");
		}
	}

	@Override
	public double checking_account_balance() {

		return accountBalance;

	}


}
