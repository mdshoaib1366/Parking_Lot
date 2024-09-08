package com.iq.ques;

import java.util.Arrays;

public class ProgramOnArray {
	
	public static int[] calculation(int a[])
	{
		int sum=a[0];
		int sub=a[0];
		int pro=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			
			sum+=a[i];
			sub-=a[i];
			pro*=a[i];
		}
		int d[] = new int[] {sum,sub,pro};
		return d;
	}
	public static void main(String[] args) {
		int a[] = {1,2,3};
		
		
		int[] cal = calculation(a);
		System.out.println(Arrays.toString(cal));
	}
}
