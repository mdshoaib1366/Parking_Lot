package com.shoaib.test;

import java.util.Scanner;

import com.day2.Square;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		int num = sc.nextInt();
		sc.close();
		String s=Square.getAreaOfSquare(num);
		System.out.println(s);
	}

}
