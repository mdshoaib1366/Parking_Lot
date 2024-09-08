package com.day2;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int rem = num%10;
		int res = num/10;
		int sum = rem + res;
		
		System.out.println("Sum is: "+sum);
		
	}
}
