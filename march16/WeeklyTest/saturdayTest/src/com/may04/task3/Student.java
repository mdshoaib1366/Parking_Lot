package com.may04.task3;

public class Student {
	int id;
	String name;
	String course;
	String collegeName;

	public Student(int id, String name, String course, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", collegeName=" + collegeName + "]";
	}

	
}
