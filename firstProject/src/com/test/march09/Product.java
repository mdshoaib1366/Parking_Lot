package com.test.march09;

class Multipy{
	public static String getProduct(int n1,int n2) {
		
		return ""+(n1*n2);
	}
}
public class Product {

	public static void main(String[] args) {
		 
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String str = Multipy.getProduct(num1,num2);
		
		System.out.println(str);
	}

}
