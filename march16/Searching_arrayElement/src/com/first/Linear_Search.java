package com.first;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
	
	public static void main(String[] args) {
		int arr []= {4,1,3,5,2};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter search element: ");
		int ele = sc.nextInt();
		int flag = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("Element at position: "+i);
				flag =1;
				break;
			}
			
		}
		if(flag == 0) System.out.println("Element not found...");
	}
}
