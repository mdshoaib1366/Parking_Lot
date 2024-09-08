package com.Fisrt.Demo;

interface I1 {

}

class Student {

}

public class Demo01 {
	public static void main(String[] args) {
		byte arr1[] = new byte[3];
		System.out.println(arr1.getClass().getName());
		short arr2[] = new short[4];
		System.out.println(arr2.getClass().getName());
		int arr3[] = new int[4];
		System.out.println(arr3.getClass().getName());
		long arr4[] = new long[5];
		System.out.println(arr4.getClass().getName());
		float arr5[] = new float[6];
		System.out.println(arr5.getClass().getName());
		double arr6[] = new double[7];
		System.out.println(arr6.getClass().getName());
		char arr7[] = new char[8];
		System.out.println(arr7.getClass().getName());
		boolean arr8[] = new boolean[9];
		System.out.println(arr8.getClass().getName());
		Student s[] = new Student[5];
		System.out.println(s.getClass().getName());
		Object ob[] = new Object[5];
		System.out.println(ob.getClass().getName());
		I1 i[] = new I1[7];
		System.out.println(i.getClass().getName());

	}
}
