package com.task1;

public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new ScienceStudent("Joy", "12th", 10, 70, 80, 90);
		System.out.println("Student Name: "+s1.studentName);
		System.out.println("Student Class: "+s1.studentClass);
		System.out.println("Total number of Student: "+Student.totalNoOfStudents);
		System.out.println("Percentage: "+s1.getPercentage());
	
		System.out.println("===========================================");
		Student s2 = new HistoryStudent("Maggie", "12th", 4, 80, 90);
		System.out.println("Student Name: "+s2.studentName);
		System.out.println("Student Class: "+s2.studentClass);
		System.out.println("Total number of Student: "+Student.totalNoOfStudents);
		System.out.println("Percentage: "+s2.getPercentage());
		
	}
}
