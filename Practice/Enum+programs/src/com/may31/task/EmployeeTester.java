package com.may31.task;

public class EmployeeTester {
	public static void main(String[] args) {
		
		Employee emp1 = new Manager(100, "John", 0, ManagerType.HR);
		emp1.setSalary(1000);
		
		Employee emp2 = new Clerk(10, "Ravi", 0, 71, 81);
		Clerk c = (Clerk)emp2;
		c.setAccuracy(85);
		c.setSpeed(90);
		
		c.setSalary(1000);
	}
}
