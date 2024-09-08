package com.may27.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FindNthMax {
	public static void searchMin(int arr[],int index) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i==index-1)
			{
				System.out.println("the "+index+"th max number is "+arr[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]={3,1,6,5,2,8} ;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnetr the nth max element: ");
		int index = sc.nextInt();
		searchMin(arr, index);
		sc.close();
	}
}
