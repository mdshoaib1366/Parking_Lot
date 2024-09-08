package com.task2.april25;

public class Tester {

	public static void main(String[] args) {
		Customer c1 = new Customer("Ben","Kumar");
		Account a1 = new Account(c1, 1234567, 10000, 2);
		
//		System.out.println(a1);

		a1.deposit(1000);
		System.out.println("you withdraw amount: "+a1.withdraw(3000));

		c1.setFirstName("Michael");
		c1.setLastName("Bhandari");
		
		System.out.println(a1);
		
	}

}
