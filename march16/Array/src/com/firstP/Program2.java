package com.firstP;

/*
 * given an array of integers return true if the array length is 1 or more and
 * the fisrt element the last elemnt both are equal  
 */
public class Program2 {

	public static boolean validate(Integer arr[])
	{
		if(arr.length>=1 && arr[0]== arr[arr.length-1])
		{
			return true;
		}
		return false;
	}
	
public static void main(String[] args) {

	Integer arr[] = {15,17,21,10,15};
	//   0    1    2    3
	// [ 15	| 17 | 21 | 10 ]
	boolean res =Program2.validate(arr);
	System.out.println(res);
	
}
}
