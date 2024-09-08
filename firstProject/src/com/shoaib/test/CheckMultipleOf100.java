package com.shoaib.test;
import java.util.Scanner;

class Check
	{
	    public static int checkNumber(int n)
	    {
	        if(n ==0 || n<0)
			{
			    return -1;
			}
			else 
			{
				int t=n/100;
				return (t+1)*100;
			}
	    }
	}

public class CheckMultipleOf100 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			sc.close();
			
		    System.out.println(Check.checkNumber(num));
		}
	}
