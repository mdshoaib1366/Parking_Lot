package com.test1;

import java.util.Arrays;

public class Program1 {
	public static int [] insert(int arr[]) {
//		int ar[] = new int[3];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		return arr;
		
	}
	public static void main(String[] args) {
		int arr[] = new int[3];
		Program1.insert(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
