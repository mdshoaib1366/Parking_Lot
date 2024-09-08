package com.test.april20;

public class NeonNumber {

	public static void main(String[] args) {
		int num = 9,sum=0;
		int temp = num;
		int res = num * num;
		while(res!=0)
		{
			int rem = res%10;
		    sum = sum + rem;
		    res/=10;
		}
		if(temp == sum)
		{
			System.out.println("neon Number");
		}
		else 
		{
			System.out.println("Not a neon number");
		}
	}

}
