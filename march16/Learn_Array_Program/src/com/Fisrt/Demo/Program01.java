package com.Fisrt.Demo;

import java.util.Scanner;

public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE FOR THE ARRAY");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("ENTER THE ELEMENT FOR INDEX:" + i);
			arr[i] = sc.nextInt();
		}

		System.out.println("AFTER INSERTION ELEMENTS ARE");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The size of the array is :" + arr.length);
	}
}
