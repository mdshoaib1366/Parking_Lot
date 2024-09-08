package com.may04.task4;

public class Developer implements Employee {

	private double baseSalary;
	
	
	public Developer(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}



	@Override
	public double calculateSalary() {
		double monSalary=baseSalary+500;
		return monSalary;
	}

}
