package com.second;

import java.util.Arrays;

public class Ques_8 {

	public static int [] largElem(int []a)
	{
		int big = 0;
		if(a[0]>a[a.length-1])
		{
			big=a[0];
		}
		else
		{
			big=a[a.length-1];
		}
		
		a[0]=big;
		a[1]=big;
		a[2]=big;
		
		return a;
	}
	public static void main(String[] args) {
		int a[]= {2,3,4};
		System.out.println(Arrays.toString(a));

		int[] res = largElem(a);
		System.out.println(Arrays.toString(res));
	}

}
