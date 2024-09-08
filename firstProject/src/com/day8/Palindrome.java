package com.day8;

public class Palindrome {
	public static boolean isPalindrome(int n)
	{
		int temp = n;
		int res = 0;
		while(n!=0)
		{
			int rem = n%10;
			res = res*10+rem;
			n/=10;
		}
		if(temp == res)return true;
		else return false;
	}
	
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(isPalindrome(num));

	}

}
