package com.firstP;

public class Program3 {

	public static boolean validate(Integer a[],Integer b[]) {
		if (a.length>=1 && b.length>=1) {
			if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Integer arr1[] = { 15, 17, 21, 10, 15 };
		Integer arr2[] = { 1, 17, 10, 15};
		// 0 1 2 3
		// [ 15 | 17 | 21 | 10 ]
		boolean res = Program3.validate(arr1,arr2);
		System.out.println(res);

	}

}