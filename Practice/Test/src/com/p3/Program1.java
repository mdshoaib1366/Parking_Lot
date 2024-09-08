package com.p3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr first number: ");
			int num1 = sc.nextInt();
			System.out.println("Enetr Second number: ");
			int num2 = sc.nextInt();
			if(num1<=0 || num2<=0)
			{
				int r = num1/num2;
			}
		
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getClass().getName());
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getClass().getName());			
		}
		
	}
}
