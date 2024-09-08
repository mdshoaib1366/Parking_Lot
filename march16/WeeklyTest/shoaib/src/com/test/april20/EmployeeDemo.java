package com.test.april20;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Manager("Raj", "Manager", 40000.0, 5000.0);
		emp1.displayInfo();
		System.out.println("Total_Salary: "+emp1.calculateSalary());
		
		System.out.println("=========================================================");
		Employee emp2 = new Programmer("Vidi", "Programmer", 60000.5, 12000.0);
		emp2.displayInfo();
		System.out.println("Total_Salary: "+emp2.calculateSalary());
	}

}
