package com.may29.Tasks;

import java.util.Arrays;

public class ProductEqualTo {

	public static void product(int arr[])
	{
		
		Arrays.sort(arr);
		int max = arr[arr.length-1]*arr[arr.length-2];
		System.out.println(max);
	}
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 7, -7, 5, 8, -5};
//		int arr[] = {2,4,9,8,3};
		product(arr);
	}

}
