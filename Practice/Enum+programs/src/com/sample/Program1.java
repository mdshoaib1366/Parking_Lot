package com.sample;

public class Program1 {
	public static void main(String[] args) {
		enum Color
		{
			RED,Blue;
		}
		System.out.println(Color.Blue.equals(args));
	}
}
