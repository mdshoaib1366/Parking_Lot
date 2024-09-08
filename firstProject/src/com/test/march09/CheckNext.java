package com.test.march09;

import java.util.Scanner;

public class CheckNext {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 values: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int res = NextMultiple.sumOfMultiples(num1,num2,num3);
		sc.close();
		
		System.out.println("ans: "+res);
	}

}


/*
a = 23, b = 34, c = 69

  30 + 40 + 70 = 140


*/