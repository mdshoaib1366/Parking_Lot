package com.lab_task.april01;

public class CheckLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan = new Loan(1000, 2, 6);
//		System.out.println("Amount: "+loan.calculateMonthlyPayment());
		System.out.println("EMI: "+loan.getDurationMonths());
//		System.out.println(loan);
	}

}
