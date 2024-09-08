package com.test.march09;

public class OddEven {
	public static String  isEvenOrOdd(int n) 
	{
//		String s ="";
		if(n==0 || n<0)
		{
			return ""+"Invalid data";
		}
		else
		{
			if(n%2==0)
			{
				return ""+"even";
			}
			else
			{
				return ""+"odd";
			}
		}
	}
}
