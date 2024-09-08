package com.task.march25;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		System.out.print("Enter the Salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter the Department: ");
		String dept = sc.nextLine();
		dept = sc.nextLine();
		sc.close();
		
		Employee e = new Employee(name, age, salary, dept);
		Employee obj = new Employee(e);
		
		System.out.println("==========before salary===========");
		System.out.println(obj.getSalary());
		obj.raiseSalary(0.10);
		System.out.println("==========after salary===========");

		System.out.println(obj.getSalary());
		System.out.println();
		System.out.println(e);
		System.out.println(obj);
		
	}

}
