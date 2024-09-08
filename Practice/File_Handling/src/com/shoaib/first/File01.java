package com.shoaib.first;

import java.io.FileInputStream;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) throws IOException {
		var fis = new FileInputStream("C:\\new\\batch30.txt");
		
		try
		{
			while(true)
			{
				int i=fis.read();
				if(i==-1)
				 break;
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
