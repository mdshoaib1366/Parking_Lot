package com.shoaib.first;

import java.io.*;

public class Read_2file {
	
	public static void main(String[] args) // throws IOException{
		var fin1 = new FileInputStream("c:\\test\\hello.txt");
		var fin2 = new FileInputStream("c:\\new\\file01.txt");
		var fos = new FileOutputStream("c:\\new\\file.txt");
		
		var sis = new SequenceInputStream(fin1, fin2);
		
		try(fin1;fin2;fos;sis)
		{
			while(true)
			{
				while(true)
				{
					int i = sis.read();
					if(i==-1) break;
					System.out.println((char)i);
					fos.write((byte)i);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
