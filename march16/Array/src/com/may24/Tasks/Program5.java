package com.may24.Tasks;

import java.util.Scanner;

public class Program5 {
	public static void search(int arr[],int ele)
	{
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele)
			{
				count ++;
			}
		}
		if(count==1) {
			System.out.println("Elemnt found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element you want to search: ");
		int ele = sc.nextInt();
		search(arr,ele);
	}
}
