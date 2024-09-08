package com.exericeOnArray;

import java.util.Arrays;

public class Desc {

	public static void main(String[] args) {
		int arr[] = {5,3,1,4,2};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int t = arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		System.out.println("Desc order: "+Arrays.toString(arr));

	}

}
