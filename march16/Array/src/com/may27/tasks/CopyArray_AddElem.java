package com.may27.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray_AddElem {
	public static void copy(int arr[])
	{
		int newArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[i];
		}
		
		for(int na : newArr)
		{
			System.out.print(na+" ");
		}
	}
	public static void copyAddElement(int arr[],int l)
	{
		Scanner sc = new Scanner(System.in);
		int newArr[] = new int[arr.length+l];
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			newArr[temp]=arr[i];
			temp++;
		}
		System.out.println("Enter your element(s): ");
		for (int i = temp; i <newArr.length ; i++) {
			int ele = sc.nextInt();
			newArr[temp]=ele;
			temp++;
		}
		
		for(int e: newArr)
		{
			System.out.print(e+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println("press 1 for copy the array.");
		System.out.println("press 2 for copy And Add more element the array.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		System.out.println("Original Array: "+Arrays.toString(arr));
		if(choice == 1)
		{
			copy(arr);
		}
		else if(choice == 2)
		{
			System.out.print("Enter how many element u want to add: ");
			int s = sc.nextInt();
			copyAddElement(arr,s);
		}
	}

}
