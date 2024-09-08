package com.lab.work;

class Calculate
{
	public static int addition(byte a, byte b)
	{
		System.out.println("sum: "+(a+b));
		return 0;
	}
	
	public static int subtraction(char ch1, char ch2)
	{
		System.out.println("sub: "+(ch1-ch2));
		return 0;
	}
	
	public static int multiplication(long x, long y)
	{
		System.out.println("Mul: "+(x*y));
		return 0;
	}
	
	public static int division(short m, short n)
	{
		if(n==0) {System.out.println("zeros are not allowed"); return 0;}
		System.out.println("div: "+(m/n));
		return 0;
	}
}

public class ArithmaticOperation {

	public static void main(String[] args) {
		char op = args[0].charAt(0);
		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);
		
		switch(op) 
		{
		case '+': Calculate.addition((byte)i,(byte)j);
					break;
		case '-': char c1=(char)i,c2=(char)j;
					Calculate.subtraction(c1,c2);
					break;
		case '*': Calculate.multiplication(i,j);
					break;
		case '/': Calculate.division((short)i,(short)j);
					break;
		default: System.out.println("Invalid operator...");
		}
		
//		System.out.println(t);
	}

}
