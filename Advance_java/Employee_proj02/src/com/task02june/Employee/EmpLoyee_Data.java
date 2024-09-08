package com.task02june.Employee;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int age;
	private double salary;
	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
public class EmpLoyee_Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
				
//				PreparedStatement ps1 = con.prepareStatement("insert into employee02 values (?,?,?,?)");
				PreparedStatement ps2 = con.prepareStatement("Select * from employee02 where age>?");
				
//				System.out.print("Enter Id: ");
//				int id = Integer.parseInt(sc.nextLine());
//				System.out.print("Enter Name: ");
//				String name = sc.nextLine();
//				System.out.print("Enter Age: ");
//				int age = Integer.parseInt(sc.next());
//				System.out.print("Enter Salary: ");
//				Float sal = Float.parseFloat(sc.next());
//				
//				ps1.setInt(1, id);
//				ps1.setString(2, name);
//				ps1.setInt(3, age);
//				ps1.setFloat(4, sal);
//				
//				int k = ps1.executeUpdate();
//				if(k>0)
//				{
//					System.out.println("Success");
//				}
				System.out.print("Enter Age >: ");
				int oAge = Integer.parseInt(sc.next());
				ps2.setInt(1, oAge);
				ResultSet rs1 = ps2.executeQuery();
				List<Employee> al = new ArrayList<Employee>();
				while(rs1.next())
				{
					int id = rs1.getInt(1);
					String name = rs1.getString(2);
					int age = rs1.getInt(3);
					Float sal = rs1.getFloat(4);
					al.add(new Employee(id,name,age,sal));
					
				}
				
				al.forEach(res -> System.out.println(res));
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
