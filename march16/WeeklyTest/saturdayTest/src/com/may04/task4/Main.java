package com.may04.task4;

public class Main {

	public static void main(String[] args) {
//		Employee emp1 = null;
		Employee emp1 = new Developer(60000);
		Employee emp2 = new Manager(40000, 10000);
		Employee emp3 = new Tester(30000,1000, 1000);
		
		System.out.println(emp1.calculateSalary());
		System.out.println(emp2.calculateSalary());
		System.out.println(emp3.calculateSalary());
		

	}

}
