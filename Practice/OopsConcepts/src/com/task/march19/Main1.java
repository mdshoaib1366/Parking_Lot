package com.task.march19;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		sc.close();
		Employee emp = new Employee(id,name,salary);
		
		emp.getEmployeeNumber();
		emp.getEmployeeName();
//		emp.getEmployeeSalary();
		
		if(emp.getEmployeeSalary()>=60000)
		{
			System.out.println("DEVLOPER");
		}
		else if(emp.getEmployeeSalary()>=40000 && emp.getEmployeeSalary()<60000)
		{
			System.out.println("DESIGNER");
		}
		else
		{
			System.out.println("TESTER");
		}
	}

}
