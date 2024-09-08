package com.test.march09;

public class NextMultiple {
		public static int sumOfMultiples(int num1,int num2,int num3)
		{
			if(num1<=0 || num2<=0 || num3<=0)
			{
				return -1;
			}
			else 
			{
				 num1 = (num1%10==0) ? num1 : (num1%10<5) ? (num1/10)*10 : (num1/10+1)*10;
				 num2 = (num2%10==0) ? num2 : (num2%10<5) ? (num2/10)*10 : (num2/10+1)*10;
				 num3 = (num3%10==0) ? num3 : (num3%10<5) ? (num3/10)*10 : (num3/10+1)*10;
				
				
			}
			return num1 + num2 + num3;
		}
		
}
