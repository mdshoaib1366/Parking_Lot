package com.lab.work;

import java.util.*;
public class Tester {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first-Name: ");
        String firstName=sc.next();
        System.out.print("Enter last-Name: ");
        String lastName=sc.next();
        System.out.print("Enter ID: ");
        int employeeId = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Number of Project: ");
        int noOfProject = sc.nextInt();
		//create Employee object
        Employeee emp = new Employeee();
		
		//call setEmployeeData() method by passing values
        emp.setEmployeeData(firstName,lastName,employeeId,noOfProject,salary);
		
		//print employee values using toString method
		
		// call calculateSalary() method
        emp.calculateSalary();
		
		//print employee values using toString method
	    String res=emp.showDetails();
		System.out.println(res);
		
		sc.close();
	}

}
