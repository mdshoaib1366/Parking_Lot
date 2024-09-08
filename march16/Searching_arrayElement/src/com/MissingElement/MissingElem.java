package com.MissingElement;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElem {
	public static void main(String[] args) {
		int arr[] = {1,3,5,9,12};
		
		if(arr[0]==1)
		{
			for (int i = 0; i < arr.length-1; i++) {
				for(int j = arr[i]; j<arr[i+1]; j++) {
					if(arr[i]!=j)
					{
						System.out.println("Missing Ele is: "+j);
					}
				}
			}
		}
		else
		{
			int newArr[] = Arrays.copyOf(arr, arr.length+1);
			for(int i= newArr.length-1; i>0; i--)
			{
				newArr[i] = newArr[i-1];
			}
			
			newArr[0]=1;
			System.out.println("The missing element is: "+1);
			for (int i = 0; i < newArr.length-1; i++) {
				for(int j=newArr[i]; j<newArr[i+1]; j++)
				{
					if(j!=newArr[i]) {
						System.out.println("The missing element is: "+j);
					}
				}
			}
		}
	}
}
