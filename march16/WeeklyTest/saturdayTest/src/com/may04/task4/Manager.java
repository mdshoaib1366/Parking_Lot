package com.may04.task4;

public class Manager implements Employee {

	private double baseSalary;

	 private double bonusPercentage;
	 
	 
	
	public Manager(double baseSalary, double bonusPercentage) {
		super();
		this.baseSalary = baseSalary;
		this.bonusPercentage = bonusPercentage;
	}



	@Override
	public double calculateSalary() {
		double monSalary = baseSalary + bonusPercentage ;
		return monSalary;
	}

}
