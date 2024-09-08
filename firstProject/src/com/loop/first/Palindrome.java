package com.loop.first;

public class Palindrome {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp=num;
		int res = 0;
		while(num!=0)
		{
			int rem = num%10;
			res = (res*10)+(rem);
			num/=10;
		}
//		res =  (num%10)*100 + ((num%100)/10)*10 + (num/100)*1;
		if(temp == res) 
		{
			System.out.println("Palindrome "+temp);
		}
		else
		{
			System.out.println(temp+"Not Palindrome");
		}
	}
}
