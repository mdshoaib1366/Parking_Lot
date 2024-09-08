package com.shoaib.Bank;

public class BankDemo {

	public static void main(String[] args) {
		Bank b = new Banks("SBI",1000); 
		b.deposit(5000);
		b.withdraw(3000);
	}

}
