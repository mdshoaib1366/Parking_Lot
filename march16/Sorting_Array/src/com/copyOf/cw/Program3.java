package com.copyOf.cw;

import java.util.Arrays;

public class Program3 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		int newArr[] = Arrays.copyOfRange(arr, 2, 5);
		
		System.out.println(Arrays.toString(newArr));
	}
}
