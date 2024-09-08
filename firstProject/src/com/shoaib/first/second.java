package com.shoaib.first;

public class second {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(args [0]);
		int y = Integer.parseInt(args [1]);
		int res = x+y;
		System.out.println("addtion: "+res);
		res = x-y;
		System.out.println("substraction: "+res);
		res = x*y;
		System.out.println("multiplication: "+res);
		res = x/y;
		System.out.println("division: "+res);
	}
}
