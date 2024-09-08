package com.task3;

public class SavingAccount extends BankAccount {

	@Override
	void withdraw(int amount) {
		if(amount<100)
		{
			System.out.println("Sorry! you can't withdraw Amount.");
		}
		else
		{
			double money = super.getBalance() - amount;
			System.out.println("Withdraw Money: "+money);
		}

	}

	@Override
	public String accountType() {
		return "Saving";

	}

}
