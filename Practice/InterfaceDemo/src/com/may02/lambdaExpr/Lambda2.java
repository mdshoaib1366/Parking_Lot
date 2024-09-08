package com.may02.lambdaExpr;

@FunctionalInterface
interface Calculate{
	void doSum(int a,int b);
}

public class Lambda2 {
	public static void main(String[] args) {
		Calculate cal = (x,y) ->
		{
			System.out.println(x+y);
			return ;
		};
		
		cal.doSum(12, 30);
	}
}
