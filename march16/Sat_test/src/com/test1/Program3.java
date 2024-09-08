package com.test1;

import java.util.Arrays;

public class Program3 {
	public static void main(String[] args) {
			int arr[]= {36, 8, 50, 12, 5, 60, 14};
			System.out.println(Arrays.toString(arr));
			int min;
			int flag =0;
			for (int i = 0; i < arr.length; i++) {
				min=i;
				for (int j = i+1; j < arr.length; j++) {
					if(arr[min]>arr[j])
					{
						min=j;
						flag=1;
					}
				}
				if(flag == 1) {
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
	}
}
