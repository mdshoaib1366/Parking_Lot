package com.New.firstProgram;


public class Sample {
	public static void main(String[] args) 
	{
		try
		{
			String s=null;
			System.out.println("123"+s.length());
		}
		catch (NullPointerException np)
		{
			System.out.println("Null Problem");
			try
			{
				String s="xyz";
				int no=Integer.parseInt(s);
				System.out.println(no);
			}
			catch (NumberFormatException nf)
			{
				System.out.println("Number Format Problem");
			}
		}
		System.out.println("Completed");
	}
}
