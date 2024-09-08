package com.task.march22;

public class TaxCalculation {

	public static void main(String[] args) {
		Employee e = new Employee(100, "A", 30000, 200, 50);
		double employeeTax=TextUtil.calculateTax(e);
		System.out.println(e);
		System.out.println("Gross Salary: "+e.calculateGrossSalary()); 
		System.out.println("Tax: "+employeeTax);
		System.out.println("\n----------------------------------------\n");
		Manager m = new Manager(101, "B", 50000, 2000, 500, 3000);
		double managerTax=TextUtil.calculateTax(m);
		System.out.println(m);
		System.out.println("Gross Salary: "+m.calculateGrossSalary()); 
		System.out.println("Tax: "+managerTax);
		System.out.println("\n-------------------------------------------\n");
		
		Sourcing s = new Sourcing(112, "W", 50000, 2000, 4000, 2000, 4, 4);
		double sourceTax=TextUtil.calculateTax(s);
		System.out.println(s);
		System.out.println("Gross Salary: "+s.calculateGrossSalary()); 
		System.out.println("Tax: "+sourceTax);
	}

}
