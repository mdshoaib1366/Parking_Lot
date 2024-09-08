package com.may29.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	
	public static int[] rotate(int arr[],int choice)
	{
		int newArr1[]=Arrays.copyOf(arr, choice);
		System.out.println(Arrays.toString(newArr1));
		int newArr2[]=Arrays.copyOfRange(arr,choice,arr.length);
		System.out.println(Arrays.toString(newArr2));
		for(int i=0; i<newArr2.length; i++)
		{
			for(int j=0; j<newArr2.length; j++)
			{
				if(newArr2[i]>newArr2[j])
				{
					int temp=newArr2[i];
					newArr2[i]=newArr2[j];
					newArr2[j]=temp;
				}
			}
		}
//		System.out.println(Arrays.toString(newArr2));
		
		//merge
		int newArr3[] = new int[arr.length];
		int c=0;
		int temp=0;
		for(int i=0; i<newArr2.length; i++)
		{
			newArr3[temp++]=newArr2[i];
			c++;
			if(c>=choice) {
			for(int j=0; j<newArr1.length; j++)
			{
				newArr3[temp++]=newArr1[j];
			}
			}
		}
		
		return newArr3;
	}
	
//	public static void r(int arr[],int ch)
//	{
//		for(int j=0;j<ch; j++)
//		{
//			int x=arr[0];
//			
//		for (int i = arr.length-2; i > 0; i--) {
//			arr[i-1]=arr[i];
//		}
//		 arr[arr.length-1]=x;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		int []res = rotate(arr,choice);
		
		System.out.println(Arrays.toString(res));
	}

}
