package com.test1;

import java.util.Arrays;

public class Program2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		long s=System.nanoTime(); 
		System.out.println(Arrays.equals(a, b));
		long e = System.nanoTime();
		System.out.println("Time: "+(e-s));
	}
}
