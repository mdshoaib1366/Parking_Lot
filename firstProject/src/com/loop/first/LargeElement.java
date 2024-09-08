package com.loop.first;

public class LargeElement {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if(num1>num2) 
		{
			System.out.println("NUM1 is bigger than NUM2 "+num1);
		}
		else
		{
			System.out.println("NUM2 is bigger than NUM1 "+num2);
		}
	}
}
