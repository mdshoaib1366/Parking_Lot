package com.task.march22;

public class TextUtil {

	public static double calculateTax(Employee emp)
	{
		if (emp.calculateGrossSalary() >= 50000)
		{
			return emp.calculateGrossSalary() * 0.20;
		} 
		else 
		{
			return emp.calculateGrossSalary() * 0.05;
		}
	}
	
	public static double calculateTax(Manager m)
	{
		if (m.calculateGrossSalary() >= 50000)
		{
			return m.calculateGrossSalary() * 0.20;
		} 
		else 
		{
			return m.calculateGrossSalary() * 0.05;
		}
	}
	
	public static double calculateTax(Sourcing s)
	{
		if (s.calculateGrossSalary() >= 50000)
		{
			return s.calculateGrossSalary() * 0.20;
		} 
		else 
		{
			return s.calculateGrossSalary() * 0.05;
		}
	}
}