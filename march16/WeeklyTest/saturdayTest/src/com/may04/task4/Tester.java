package com.may04.task4;

public class Tester implements Employee{

	 private double baseSalary;

	  private double bonusPercentage;

	private double homeallowance;

	public Tester(double baseSalary, double bonusPercentage, double homeallowance) {
		super();
		this.baseSalary = baseSalary;
		this.bonusPercentage = bonusPercentage;
		this.homeallowance = homeallowance;
	}

	@Override
	public double calculateSalary() {
		double monSalary = baseSalary + (bonusPercentage + homeallowance);
		return monSalary;
	}
	
	

}
