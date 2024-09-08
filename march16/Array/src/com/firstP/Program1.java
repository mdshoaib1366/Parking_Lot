package com.firstP;

/*
 * 
 */
public class Program1 {
	public static boolean validate(Integer arr[])
	{
		if(arr.length>=1 && arr[0]==15 || arr[arr.length-1]==15)
		{
			return true;
		}
		return false;
	}
	
public static void main(String[] args) {

	Integer arr[] = {15,17,21,10};
	//   0    1    2    3
	// [ 15	| 17 | 21 | 10 ]
	boolean res =Program1.validate(arr);
	System.out.println(res);
	
}
}
