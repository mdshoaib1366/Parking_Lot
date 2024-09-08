package com.loop.first;

public class Print100Numbers {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(i+" ");
		}
	}
}
