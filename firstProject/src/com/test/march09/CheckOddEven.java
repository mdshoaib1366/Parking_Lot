package com.test.march09;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int num = sc.nextInt();
		
		System.out.println(OddEven.isEvenOrOdd(num));
		sc.close();
	}

}
