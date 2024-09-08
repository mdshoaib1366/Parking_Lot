package com.task.march27;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("VINAY", "96");
		System.out.println(CalculateStudentGrade.calculateGrade(s1));
		
		s1.setStudentName("RAHUL");
		s1.setStudentMarks("45");
		System.out.println(CalculateStudentGrade.calculateGrade(s1));
		
//		System.out.println(s1.getStudentMarks());
		System.out.println(s1);
		
		CalculateStudentGrade.calculateGrade(s1);
	}

}
