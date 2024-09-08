package com.may29.Tasks;

import java.util.Arrays;

public class SeperateEvenOdd {

	public static void seperate(int arr[])
	{
		int odd=0;
		int even=0;
		int temp1=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			{
				odd++;
			}
			else
			{
				even++;
			}
		}
		
		int newArr1[] = new int[odd];
		int newArr2[] = new int[even];
		int temp2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			{
				newArr1[temp1++]=arr[i];
			}
			else
			{
				newArr2[temp2++]=arr[i];
			}
		}
		System.out.println("Odd elements: "+Arrays.toString(newArr1));
		System.out.println("Even elements: "+Arrays.toString(newArr2));
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		seperate(arr);
	}

}
