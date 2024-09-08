package com.fill.Elements;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void fill(int arr[],int ele)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=ele;
		}
		System.out.println(Arrays.toString(arr));	
	}
	public static void fill(int arr[],int start,int end,int ele)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(i>=start && i<end)
			{
				arr[i]=ele;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println("press 1 for common element filling");
		System.out.println("press 2 for range filling");
		Scanner sc = new Scanner(System.in);
		System.out.print("choose anyone option: ");
		int op = sc.nextInt();
		if(op==1)
		{
			System.out.print("enter the element you want to repeat: ");
			int ele = sc.nextInt();
//			fill(arr,ele);
			Arrays.fill(arr, ele);
		}
		else if(op==2)
		{
			System.out.print("Enter the Start postion: ");
			int start = sc.nextInt();
			System.out.print("Enter the End postion: ");
			int end = sc.nextInt();
			System.out.print("enter the element you want to repeat: ");
			int ele = sc.nextInt();
			//fill(arr,start,end,ele);
			Arrays.fill(arr,start,end,ele);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
