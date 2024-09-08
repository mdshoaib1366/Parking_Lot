package com.test.april20;

public class Programmer extends Employee {

	private double baseSalary;
	private double overTimePay;

	public Programmer(String name, String role, double baseSalary, double overTimePay) {
		super(name, role);
		this.baseSalary = baseSalary;
		this.overTimePay = overTimePay;
	}

	@Override
	public void displayInfo()
	{
		 System.out.println("name: "+name+"role: "+role+" ,Base_Salary: "+baseSalary+" ,Over_time_Pay: "+overTimePay);
	}
	
	@Override
	public double calculateSalary()
	{
		double totalSalary = this.baseSalary + this.overTimePay;
		return totalSalary;
	}
}
