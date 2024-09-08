package com.shoaib.first;

import java.io.File;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) 
	{
		try
		{
			File f1 = new File("c:\\new\\batch30.txt");
			
			if(f1.exists())
			{
				System.out.println("File is exist.");
			}
			else
			{
				System.out.println("File is not exist.");
			}
			
			if(f1.createNewFile())
			{
			
				
				System.out.println("File created: "+f1.getName());
			}
			else
			{
				System.out.println("File is already exist.....");
			}
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
}
