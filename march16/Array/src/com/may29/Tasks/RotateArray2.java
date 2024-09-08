package com.may29.Tasks;

import java.util.Arrays;

public class RotateArray2 {
	public static void rotate(int arr[],int ch)
	{
		for (int i = 0; i < ch; i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-1; j>i; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int choice=2;
		rotate(arr, choice);
		
	}
}
