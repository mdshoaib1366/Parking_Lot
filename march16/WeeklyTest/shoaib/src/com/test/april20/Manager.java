package com.test.april20;

public class Manager extends Employee {

	private double baseSalary;
	private double bonus;

	public Manager(String name, String role, double baseSalary, double bonus) {
		super(name, role);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	@Override
	public void displayInfo()
	{
		 System.out.println("name: "+name+"role: "+role+" ,Base_Salary: "+baseSalary+" ,Bonus: "+bonus);
	}
	
	public double calculateSalary()
	{
		double totalSalary = this.baseSalary + this.bonus;
		return totalSalary;
	}
}
