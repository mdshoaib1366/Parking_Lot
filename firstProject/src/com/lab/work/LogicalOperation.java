package com.lab.work;
import java.util.Scanner;

class Palindrome{
	public static int isPalindrome(int x) {
		int temp = x;
		int res = 0;
		while(x!=0)
		{
			res = res*10 + (x%10);
			x/=10;
		}
		if(temp==res) return res;
		return 0;
	}
}

class Armstrong{
	static boolean findArmstrong(int n)
	{
		int r,temp, sum = 0;
		temp = n;
		while(temp>0)
		{
			r = temp%10;
			sum = sum + r*r*r;
			temp/=10;
		}
		
		if(sum == n) 
			return true;
		else 
			return false;
	}
}

class Prime{
	public static boolean isPrime(int m)
	{
		int c=0;
		for(int i=2; i<=m; i++)
		{
			if(m%i==0) c++;
			
		}
		if(c==1) return true;
		else return false;
	}
}
public class LogicalOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
//		System.out.print("Palindrome : ");
		for(int i=1;i<=num;i++)
		{
			
//			int p = Palindrome.isPalindrome(i);
//			if(p==i) System.out.print(" "+p);
//			else continue;
			
			boolean a = Armstrong.findArmstrong(i);
			if(a==true) System.out.print(" "+i);
			
//			boolean pr = Prime.isPrime(i);
//			if(pr==true) System.out.print(" "+i);
//			else continue;
		}
		
	}
}
