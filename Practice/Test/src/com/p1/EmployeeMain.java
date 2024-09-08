package com.p1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee
{
	String name;

	public Employee(String n) {
		this.name=n;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}
	
//	public boolean equals(Object obj)
//	{
//		Employee e=(Employee)obj;
//		return e.name.equals(this.name);
//	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		
		Set<Employee> set=new HashSet<Employee>();
		set.add(new Employee("abc"));
		set.add(new Employee("abc"));
		System.out.println(set);
//		System.out.println(new Employee("abc").hashCode());
//		System.out.println(new Employee("abc").hashCode());
	}
}
