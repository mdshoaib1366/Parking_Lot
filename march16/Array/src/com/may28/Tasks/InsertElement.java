package com.may28.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

	public static void inserting(int arr[],int ele,int index)
	{
		int newArr [] = Arrays.copyOf(arr, arr.length+1);
		for (int i = newArr.length-1; i > index-1; i--) 
		{
			newArr[i]= newArr[i-1];
		}
		newArr[index-1]=ele;
		System.out.println(Arrays.toString(newArr));
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position: ");
		int pos = sc.nextInt();
		System.out.print("Enter the Element: ");
		int ele = sc.nextInt();
		inserting(arr, ele, pos);
	}

}
