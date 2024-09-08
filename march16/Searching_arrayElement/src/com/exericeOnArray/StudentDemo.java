package com.exericeOnArray;

import java.util.Objects;

class Student
{
	 String name;
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
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
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
}
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Monu");
		Student s2 = new Student("Monu");
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		Student arr[] = {s1,s2,s3,s4,s5};
		
			
		int flag =0;
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].equals(arr[j]))
				{
//					System.out.println("Equal");
					flag=1;			
				}
				
			}
		
			if(flag==1){
				System.out.println("Equal");
				System.out.println(arr[i].hashCode());
			}
			else
			{
				System.out.println("Unequal");
				System.out.println(arr[i].hashCode());
			}
		}
		
	}
}
