package com.overloading1;

class Test
{
	public static void main(String[] args) {
		
		int a = 1;// 2
		int b = 2;// 3
		int c = 3;// 2
		
		a=b;//  a= 2
		b=c;//  b=3
		c=a;//  c=2
		
		
		System.out.println(a+b+c);
	}
}
