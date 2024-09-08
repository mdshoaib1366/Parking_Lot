package com.may24.Tasks;

import java.util.Arrays;

/*	3,1,4,2,5,9,7
 *
 * 
 */


public class Program4 {
	public static void bubbleSort(int arr[])
	{
		int max = 0;
		for (int i = 0; i < arr.length-1; i++) // len=6 ,i=0
		{
			max = i;  // max = 0
			for(int j=i+1; j<arr.length; j++) // len=7,j=6
			{
				if(arr[max]<arr[j]) // 9<7
				{
					max=j; // 5
				}
			}
			int temp=arr[i]; // temp = 3
			arr[i]=arr[max]; // arr[0] = 7
			arr[max]=temp; // arr[0] = 3
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {3,1,4,2,5,9,7};
		bubbleSort(arr);
	}
}
