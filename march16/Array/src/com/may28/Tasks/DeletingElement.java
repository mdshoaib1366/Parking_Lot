package com.may28.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class DeletingElement {

	public static void deleting(int arr[],int ele)
	{
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			
				if(arr[i]==ele)
				{
					flag=1;
					for(int j=i;j<arr.length-1;j++)
					arr[j] =arr[j+1];
					
				}
				
		}
		if(flag==1) {
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else
		{
			System.out.println("Element not found");
		}
//		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Element: ");
		int ele = sc.nextInt();
		deleting(arr, ele);
	}


}
