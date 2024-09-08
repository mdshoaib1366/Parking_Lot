package com.day8;

public class GreatestOfThreeIntegers {

	static int getGreatest(int num1, int num2, int num3) {
		
			if(num1 < 0 || num2 < 0 || num3 < 0) 
			{
				return -1;
			}
			else if(num1 == 0 || num2 == 0 || num3 == 0)
			{
				return -2;
			}
			else if(num1>num2 && num1>num3)
			{
				System.out.print("MY GREATEST NO IS ");
				return num1;
			}
			else if(num2>num1 && num2>num3)
			{
				System.out.print("MY GREATEST NO IS ");
				return num2;
			}
			else if(num3>num1 && num3>num2)
			{
				System.out.print("MY GREATEST NO IS ");
				return num3;
			}
			return 0;
		}
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		System.out.print("NUM1: "+n1);
		int n2 = Integer.parseInt(args[1]);
		System.out.print("\nNUM2: "+n2);
		int n3 = Integer.parseInt(args[2]);
		System.out.println("\nNUM3: "+n3);
		
		System.out.print(getGreatest(n1,n2,n3));
		
	}

}
