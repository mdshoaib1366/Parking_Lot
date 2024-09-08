package com.simple_sorting;

import java.util.Arrays;

public class ArraySorting {
	public static void sort(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int arr[] = {2,11,13,10,15};
		System.out.println(Arrays.toString(arr));
		ArraySorting.sort(arr);
	}
}





