package com.test1;

import java.util.function.Predicate;

public class Program4 {
	public static void main(String[] args) {
		Predicate<Integer> p = (num)-> {
			int count=0;
			boolean res = false;
			for(int i=1; i <= num; i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
				res = true;
			return res;
		};
		System.out.println(p.test(5));
	}
}
