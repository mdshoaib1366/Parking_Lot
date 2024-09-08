package com.may02.lambdaExpr;


@FunctionalInterface
interface Length
{
	int getLength(String str);
	
}

public class Lambda3 {
	public static void main(String[] args) {
		Length len = str -> str.length();
		
		System.out.println(len.getLength("Lucknow"));
		
	}
}
