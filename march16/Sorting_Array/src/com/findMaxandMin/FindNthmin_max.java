package com.findMaxandMin;

import java.util.Scanner;

public class FindNthmin_max {
	public static void findSmallest(int arr[],int choiceIndex)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
			if(i==choiceIndex-1)
			{
				System.out.println("smallest "+choiceIndex+" element is: "+arr[i]);
				break;
			}
		}
	}
	
	public static void findLargest(int arr[],int choiceIndex)
	{
		for (int i = 0; i < arr.length; i++) { // i=0
			for (int j = i+1; j < arr.length; j++) { //j=5
				if(arr[i]<arr[j]) // 18<3
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}//  18,11,14,12,15,3
			if(i==choiceIndex-1)
			{
				System.out.println("Largest "+choiceIndex+": "+arr[i]);
				break;
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {14,11,15,12,18,3}; // {6,1,4,2,0};
	System.out.println("1) press 1 for smallest ");
	System.out.println("2) press 2 for Largest ");
	System.out.print("choose option: ");
	Scanner sc = new Scanner(System.in);
	int op = sc.nextInt();
	
	if(op==1)
	{
		System.out.print("enter the nth element: ");
		int ele = sc.nextInt();
		findSmallest(arr, ele);
	
	}
	else if(op==2)
	{
		System.out.print("enter the nth element: ");
		int ele = sc.nextInt();
		
		findLargest(arr, ele);
	}
	else
	{
		System.out.println("invlaid input");
	}
}
}
