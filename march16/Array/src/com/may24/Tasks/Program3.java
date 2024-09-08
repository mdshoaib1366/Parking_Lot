package com.may24.Tasks;

import java.util.Arrays;

public class Program3 {
	public static void sort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {3,1,4,2,5,9,7};
		System.out.println(Arrays.toString(arr));
//		sort(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
