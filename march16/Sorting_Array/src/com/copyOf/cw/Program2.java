package com.copyOf.cw;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int newArr[] = Arrays.copyOf(arr, arr.length+1);
		
		System.out.println(Arrays.toString(newArr));
	}

}
