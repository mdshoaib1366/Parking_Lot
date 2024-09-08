package com.loop.first;

public class Table {
	public static void main(String[] args) {
		int i;
		int num = Integer.parseInt(args[0]);
		for(i=1; i<=10; i++) {
			int res = num*i;
			System.out.print(res+" ");
		}
	}
}
