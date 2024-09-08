package com.association.exam;

import java.util.Scanner;

public class Faculty {
	
	public static void viewStudentProfile(Student s) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter registeration numbber : ");
	int regNumber = sc.nextInt();
	sc.close();
	
	if(regNumber == s.getRegNumber())
		{
			System.out.println(s);
		}
	else
	{
		System.out.println("cannot find regNumber!!!");
	}
	}
}
