package serialization_Pros;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;
	private Date doj;

	public Employee(int id, String name, double salary, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}

	public static Employee getEmployeeObject()
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Employee Id :");
	   int id = sc.nextInt();
	   
	   System.out.print("Enter Employee Name :");
	   String name = sc.nextLine();
	   name = sc.nextLine();
	   
	   System.out.print("Enter Employee Salary :");
	   double salary = sc.nextDouble();
	   
	   Date d = new Date();
	   
	   return new Employee(id, name, salary, d);   
	   
	}
}
