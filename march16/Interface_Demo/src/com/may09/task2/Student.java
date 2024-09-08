package com.may09.task2;

public class Student {
	private String name;
	private String id;
	private char grade;
	
	
	public Student(String name, String id,char grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade= grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
}
