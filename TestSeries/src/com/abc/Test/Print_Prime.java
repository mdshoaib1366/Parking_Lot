package com.abc.Test;

public class Print_Prime {
	public static void main(String[] args) {
		for(int i=1; i<1000; i++)
		{
			int count = 0;
			for(int j=1; j<1000;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2) System.out.println(i);
		}
	}
}
