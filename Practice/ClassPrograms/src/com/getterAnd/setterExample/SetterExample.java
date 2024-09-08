package com.getterAnd.setterExample;

public class SetterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course javaPlacement = new Course("C", "Kishore Sir", 45);
		System.out.println(javaPlacement);
		
		if(javaPlacement.getSubjectName().equals("C"))
		{
			System.out.println("Ready for Core Java");
		}
		
		javaPlacement.setSubjectName("Core Java");
		javaPlacement.setFacultyName("Ravi");
		javaPlacement.setCourseDuration(90);
		System.out.println(javaPlacement);
		
		if(javaPlacement.getSubjectName().equals("Core Java"))
		{
			System.out.println("Be ready for Adv Java");
		}
	}

}
