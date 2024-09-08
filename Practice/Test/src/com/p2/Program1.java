package com.p2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Program1 {
	public static void insert(int arr[],int ele,int pos)
	{
		int temp = 0;
		int newArr[] = Arrays.copyOf(arr, arr.length+1);
		System.out.println(Arrays.toString(newArr));

			for (int i = newArr.length-1; i > pos-1; i--) {
				newArr[i]=newArr[i-1];
			}
			newArr[pos-1]=100;
			System.out.println(Arrays.toString(newArr));
		}
		
		
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the position :");
		int pos = sc.nextInt();
		System.out.print("Enetr the element :");
		int ele = sc.nextInt();
		insert(arr, ele,pos);
		
	}
}
