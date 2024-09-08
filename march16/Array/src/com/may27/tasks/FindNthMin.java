package com.may27.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FindNthMin {

	public static void searchMin(int arr[],int index) {
		for (int i = 0; i < arr.length; i++) {
			if(i==index-1)
			{
				System.out.println("the "+index+"th min number is "+arr[i]);
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]={3,1,6,5,2,8} ;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnetr the nth min element: ");
		int index = sc.nextInt();
		searchMin(arr, index);
		sc.close();
	}

}
