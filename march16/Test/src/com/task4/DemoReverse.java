package com.task4;

import java.util.Arrays;

public class DemoReverse {
	public static int[] reverse(int a[])
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[a.length-i-1];
////			
		}
//		a[0]=a[a.length-1];
//		a[1]=a[a.length-2];
//		a[2]=a[a.length-3];
		
		return b;
	}

	public static void main(String[] args) {
		int []arr= {1,2,3};
		System.out.println(Arrays.toString(arr));
		int[] reverse = reverse(arr);
		System.out.println(Arrays.toString(reverse));

	}

}
