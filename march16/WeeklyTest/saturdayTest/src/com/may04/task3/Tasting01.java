package com.may04.task3;

public class Tasting01 {
	public static void main(String[] args) {
		Student s1 = new Student(11, "Atul", "Science", "SML");
		Student s2 = new Student(111, "John", "History", "JNU");
		
		
		ScienceCollege sc = new ScienceCollege(s1);
		sc.getCollegeName();
		sc.addStudent(s1);
		sc.showcaseCollegeDetails();
		
		HistoryCollege hc = new HistoryCollege(s2);
		hc.getCollegeName();
		hc.addStudent(s1);
		hc.showcaseCollegeDetails();
	}
}
