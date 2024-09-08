package com.exericeOnArray;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void validate(Employee emp[])
	{
		int count=0;
		for(int i=0; i<emp.length; i++)
		{
			if(emp[i].salary>20000)
			{
				count++;
			}
		}
		Employee []arr = new Employee[count]; 
		int temp=0;
		for(int i=0; i<emp.length; i++)
		{
			if(emp[i].salary>20000)
			{
				arr[temp]=emp[i];
				temp++;
			}
		}
		
		for(Employee em:arr)
		{
			System.out.println(em);
		}
	}
}

public class Emp_demo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "A",10000);
		Employee e2 = new Employee(2, "B",20000);
		Employee e3 = new Employee(3, "C",30000);
		Employee e4 = new Employee(4, "D",40000);
		
		Employee emp[]= {e1,e2,e3,e4};
		Employee.validate(emp);
	}
}
