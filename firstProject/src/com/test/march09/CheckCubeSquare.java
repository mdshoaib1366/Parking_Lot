package com.test.march09;

import java.util.Scanner;

public class CheckCubeSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int num = sc.nextInt();

		sc.close();
		
		System.out.println(CubeSquare.calculate(num));
	}

}
