package com.day4;

public class FindDays {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int y = num/365;
		int m = (num%365)/12;
		int d = (num%365)%12;
		
		System.out.println("Year(s)="+y+"\tMonth(s)="+m+"\tday(s)="+d);
	}
}
