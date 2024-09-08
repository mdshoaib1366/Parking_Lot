package com.task3;

import java.util.Scanner;

public class User {
	

	public static void main(String[] args) {
		CarShowRoom sr = new CarShowRoom();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		CarShowRoom [] pro = new CarShowRoom[size];
		sr.insert(pro,sc);
//		CarShowRoom.print(pro);
		CarShowRoom[] result = CarShowRoom.requirement(pro);
		
		for(CarShowRoom res: result)
		{
			System.out.println(res);
		}
	}

}
