package com.heterogenous_array;

import java.util.Arrays;
import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee()
	{
		
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		this.id = id;
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void insert(Employee[] e, Scanner sc) {
		for (int i = 0; i < e.length; i++) {
			System.out.print("Enter id[" + (i + 1) + "]: ");
			this.id = sc.nextInt();
			System.out.print("Enter Name[" + (i + 1) + "]: ");
			this.name = sc.next();
			System.out.print("Enter salary[" + (i + 1) + "]: ");
			this.salary = sc.nextDouble();

			e[i] = new Employee(id, name, salary);
		}
	}

	public void print(Employee []e)
	{
		for(Employee emp:e)
		{
			System.out.println(emp);
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scr.nextInt();
		Employee[] emp = new Employee[size];

		e.insert(emp, scr);
//		e.print(emp);
		System.out.println(Arrays.toString(emp));
//		System.out.println(emp);
	}
	
}
