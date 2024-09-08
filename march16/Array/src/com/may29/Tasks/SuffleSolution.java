package com.may29.Tasks;

import java.util.Arrays;
import java.util.Random;

public class SuffleSolution {

	public static void shuffle(int arr[])
	{
		Random r = new Random();
		for (int i = arr.length-1; i>0; i--) {
			
			int p = r.nextInt(i);
			
			int temp = arr[i];
			arr[i] = arr[p];
			arr[p] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6};
		
		 shuffle(arr);

		 
	}

}
