package com.march23.returnType_class;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of object: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			Book book = Book.getBookObject();
			System.out.println(book);
			System.out.println();
		}
		
		sc.close();
	}

}
