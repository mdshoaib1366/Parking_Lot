package com.first;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element for search: ");
		int ele = sc.nextInt();
		
		int start = 0;
		int end = arr.length-1;
		int middle = (start + end)/2;
		
		while(start<=end) {
			if(arr[middle]==ele)
			{
				System.out.println("Element present at index ["+middle+"] : "+arr[middle]);
				break;
			}
			else if(arr[middle]<ele)
			{
//				System.out.println("Element present at index: "+arr[start]);
				start=middle+1;
			
			}
			else if(arr[middle]>ele) 
			{
				end=middle-1;
			}
			middle = (start + end)/2;
		}
		if(start>end) System.out.println("not found");
		
	}
}
