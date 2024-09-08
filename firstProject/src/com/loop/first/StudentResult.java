package com.loop.first;

public class StudentResult {
	public static void main(String[] args) {
		int marks[]=new int[args.length];
		int sum = 0;
		for(int i=0; i<marks.length; i++)
		{
			
			int val =Integer.parseInt(args[i]);
			sum += val;
		}
		System.out.println("Sum Is: "+sum);
	
	}
}
