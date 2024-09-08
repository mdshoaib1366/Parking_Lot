package com.task2;

public class GCD {

	public static void main(String[] args) {
		int x=24;
		int y=36;
		int n1 = x,n2=y;
		while(y % x!=0)
		{
			int t = x;
			x = y%x;  // 12, 
			y = t; 
//			y = y%x;
//			break;
		}
		int gcd = x;
		System.out.println(x);
		lcm(n1,n2,gcd);
//		System.out.println((x*y)/x);
	}
	
	static void lcm(int m,int n,int g)
	{
		System.out.println("LCM "+(m*n)/g);
	}

}
