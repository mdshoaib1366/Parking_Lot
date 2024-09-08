package com.second;

public class Ques_7 {

	public static int largestElement(int arr[])
	{
		int big = arr[0];
		
		if(arr[1]>big)
		{
			big=arr[1];
		}
		if(arr[2]>big)
		{
			big=arr[2];
		}
		
		return big;
	}
	public static void main(String[] args) {
		int arr []= {-2,-6,-3};
		int res = largestElement(arr);
		System.out.println(res);
	}

}
