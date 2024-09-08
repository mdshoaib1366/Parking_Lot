package com.demo;

import java.util.Arrays;

public class Sample {
public static void print(int arr[]) {
arr[5]=5;
System.out.println(Arrays.toString(arr));
}
public static void main(String[] args) {
int arr[]=new int[6];
Sample.print(arr);
}
}


