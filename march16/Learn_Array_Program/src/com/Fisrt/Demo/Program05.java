package com.Fisrt.Demo;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the Size: ");
		int size = sc.nextInt();
		double d[] = new double[size];
		
		for(int i=0;i<d.length;i++)
		{
			System.out.print("enter the element["+i+"]:");
			 d[i] = sc.nextDouble();
		}
		
		System.out.print("your Array: ");
		for(int i=0;i<d.length;i++)
		{
			System.out.print(" "+d[i]);
	
		}
	}

}
