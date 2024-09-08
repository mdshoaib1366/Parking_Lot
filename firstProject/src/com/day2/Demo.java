package com.day2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		int num = sc.nextInt();
		Square.getAreaOfSquare(num);
		sc.close();
	}

}	
