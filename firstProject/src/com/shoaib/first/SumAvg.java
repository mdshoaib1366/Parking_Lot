package com.shoaib.first;

public class SumAvg {
	public static void main(String []args)
	{
		int sum = 0;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
			
		sum = num1 + num2 + num3;
		
		System.out.println("sum: "+sum);
		
		double avg = (float)sum/3;
		
		System.out.println("Average: "+avg);
	}
}
