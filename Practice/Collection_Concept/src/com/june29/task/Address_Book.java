package com.june29.task;

import java.util.Scanner;
import java.util.TreeMap;

public class Address_Book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Long> con = new TreeMap<String, Long>();
//		en.clear();
		if(con.isEmpty()) {
			System.out.print("(it's Empty) ");
			
		}
		
		while(true)
		{
			System.out.println("\n******choose anyOne option******");
			System.out.println("\n1.Add Contact."
					+"\n2.Remove Contact."
					+"\n3.Exit.");
				System.out.print("choose option: ");			
			switch(Integer.parseInt(sc.next()))
			{
			case 1:
				System.out.print("Enter Name: ");
				String s = sc.next().toLowerCase();
				System.out.print("Enter Contact: ");
				Long ph = Long.parseLong(sc.next());
				con.put(s, ph);

				System.out.println("Contact has been added. ");
				System.out.println("\n"+con);
				break;
			case 2:
				System.out.println("Enter name u want to remove: ");
				String rStu = sc.next().toLowerCase();
				
//				System.out.println(en.containsValue(en.get(rStu)));
				if(con.isEmpty())
				{
					System.out.println("It is empty.");
				}
				else if(con.containsValue(con.get(rStu)))
				{
					con.replace(rStu, null);
						if(con.containsKey(rStu)) {
							con.remove(rStu);
							System.out.println(con);
						}
				}
				else
				{
					System.out.println("Name not found");
				}
				break;
			case 3:
				System.out.println("Exit successfully...");
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
			
		 }

	}

}
