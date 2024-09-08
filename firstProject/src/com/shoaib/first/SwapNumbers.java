package com.shoaib.first;

public class SwapNumbers {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);	//10
		int num2 = Integer.parseInt(args[1]);	//20
		
		System.out.println("before Swap: "+num1+" "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After Swap: "+num1+" "+num2);
	}
}
