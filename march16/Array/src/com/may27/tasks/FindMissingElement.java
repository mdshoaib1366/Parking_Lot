package com.may27.tasks;

import java.util.Arrays;

public class FindMissingElement {
	public static void missingEle(int arr[])
	{
		if(arr[0]==1) {  // 1,3,4,6,9
			System.out.println(Arrays.toString(arr));

			for (int i = 0; i < arr.length-1; i++) {
				for (int j = arr[i]; j < arr[i+1]; j++) {
					
					if(arr[i]!=j)
					{
						System.out.print(j+" ");
					}
				}
			}
		}
		else
		{
			int newArr[] = Arrays.copyOf(arr, arr.length+1);;
//			System.out.println(Arrays.toString(newArr));
			
			for (int i = newArr.length-1; i > 0; i--) {
				newArr[i]=newArr[i-1];
			}
			newArr[0]=1;
			System.out.println(Arrays.toString(newArr));
			for (int i = 0; i < newArr.length-1; i++) {
				for (int j = newArr[i]; j < newArr[i+1]; j++) {
					
					if(newArr[i]!=j)
					{
						System.out.print(j+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,6,9};
		missingEle(arr);
	}
}
