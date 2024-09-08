package com.inheritance.april4;

public class Hosteller extends Student {

	protected double hostelFee;

	public Hosteller(int studentId, String studentName, double examFee, double hostelFee) {
		super(studentId, studentName, examFee);
		this.hostelFee = hostelFee;
	}

	public void payFee(double amount) {
		if (amount < 1) {
			System.out.println("All fees are clear.");
		} 
		else {
			amount = amount - (hostelFee + super.examFee);
			System.out.println("Excess amount: " + amount);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "hostelFee=" + hostelFee + "]";
	}

}
