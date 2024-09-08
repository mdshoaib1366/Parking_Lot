package com.may28.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Deleting_user_Index {

	public static void delete(int arr[],int choice)
	{
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			
				if(i==choice-1)
				{
					for (int j = i; j < arr.length-1; j++) {
						arr[j]=arr[j+1];
					}
				}
			
		}
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		delete(arr, choice);
	}

}
