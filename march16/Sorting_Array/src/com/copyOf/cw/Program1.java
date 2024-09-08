package com.copyOf.cw;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int size = arr1.length + arr2.length;
		int newArr[] = new int[size];
		int temp = 0;
		for(int i=0; i<arr1.length; i++)
		{
			newArr[temp]=arr1[i];
			temp++;
		}
		for(int i=0; i<arr2.length; i++)
		{
			newArr[temp]=arr2[i];
			temp++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(newArr));
	}
}
