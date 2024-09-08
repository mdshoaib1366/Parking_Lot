package com.shoaib.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copying_fileData {
	public static void main(String[] args) throws IOException {
		var fis = new FileInputStream("c:\\new\\batch30.txt");
		var fos = new FileOutputStream("C:\\new\\file01.txt");
		
		try(fos;)
		{
			while(true) {
			int i = fis.read();
				if(i==-1)
				{
					break;
				}
				System.out.println((char)i);
				fos.write((byte)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
