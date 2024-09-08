package com.bubble_sorting;

import java.util.Arrays;
/*
 * 4	2	6	3	9						
 * 2	4	6	3	9						2	4	3	6	9
 * 2	4	6	3	9						2	3	4	6	9
 * 2	4	3	6	9						2	3	4	6	9
 * 											
 * 2	3	4	6	9
 * 2	3	4	6	9
 * 2	3	4	6	9
 * 2	3	4	6	9
 * 
 */
public class Bubble_sort {
	public static void main(String[] args) {
		int arr[]= {1,3,2,4,5};
		boolean flag=false;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {		//i=3
			for (int j = 0; j < arr.length-1-i; j++) {	//j=
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];  //temp = 
					arr[j]=arr[j+1];	//
					arr[j+1]=temp;	
					flag = true;
				}
			}
			if(flag==true) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}





