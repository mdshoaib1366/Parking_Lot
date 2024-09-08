package com.june29.task;

import java.util.Scanner;
import java.util.TreeMap;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Character> en = new TreeMap<String, Character>();
//		en.clear();
		if(en.isEmpty()) {
			System.out.print("no students and grades.(it's Empty) ");
			
		}
		
		while(true)
		{
			System.out.println("\n******choose anyOne option******");
			System.out.println("\n1.Add Student Grade."
					+"\n2.Remove Student Grade."
					+"\n3.Exit.");
				System.out.print("choose option: ");			
			switch(Integer.parseInt(sc.next()))
			{
			case 1:
				System.out.print("Enter Stu Name: ");
				String s = sc.next().toLowerCase();
				System.out.print("Enter Stu Grade: ");
				Character ch = sc.next().toUpperCase().charAt(0);
				en.put(s, ch);
//				en.put("jay", 'B');
//				en.put("salman", 'D');
//				en.put("abdul", 'A');
//				en.put("ajay", 'A');
//				en.put("ravi", null);
				System.out.println("grade has been added for the student. ");
				System.out.println("\n"+en);
				break;
			case 2:
				System.out.println("Enter stu name u want to remove: ");
				String rStu = sc.next().toLowerCase();
				
//				System.out.println(en.containsValue(en.get(rStu)));
				if(en.isEmpty())
				{
					System.out.println("Student Grade is empty.");
				}
				else if(en.containsValue(en.get(rStu)))
				{
					en.replace(rStu, null);
						if(en.containsKey(rStu)) {
							en.remove(rStu);
							System.out.println(en);
						}
				}
				else
				{
					System.out.println("Student not found");
				}
				break;
			case 3:
				System.out.println("!!!!!!!FareWeLL!!!!!!!");
				System.out.println("Exit successfully...");
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
			
		 }
		
	}
}
