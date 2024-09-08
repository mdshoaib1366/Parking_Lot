package com.shoaib.first;

import java.io.*;

public class Program2 {
	public static void main(String[] args) 
	{
		try {
			File file = new File("Library\\test.txt");
			if (file.getParentFile().mkdir()) {
//				file.createNewFile();
			} else {
				throw new IOException("Failed to create directory " + file.getParent());
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

    }
}
