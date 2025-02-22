package com.may04.task3;

public class HistoryCollege implements College {


	Student stu;

	public HistoryCollege(Student stu) {
		super();
		this.stu = stu;
	}

	@Override
	public void getCollegeName() {
		System.out.println("College Name: "+stu.collegeName);

	}

	@Override
	public void addStudent(Student student) {
		this.stu = student;
		if(stu.hashCode()*0.0000000001 < 10)
		{
			System.out.println("Student added...");
		}
		else	
		{
			System.out.println("College is full");
		}

	}

	@Override
	public void showcaseCollegeDetails() {
		System.out.println(stu.toString());

	}


}
