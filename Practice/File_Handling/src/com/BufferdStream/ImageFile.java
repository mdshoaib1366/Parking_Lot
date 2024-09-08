package com.BufferdStream;

import java.io.*;

public class ImageFile {
	public static void main(String[] args) throws IOException{
		var fin = new FileInputStream("c:\\new\\tiger.jpeg");
		
		var f1 = new FileOutputStream("c:\\new\\a2.jpeg");
		var f2 = new FileOutputStream("c:\\new\\b2.jpeg");
		var f3 = new FileOutputStream("c:\\new\\c2.jpeg");
		
		var bout = new ByteArrayOutputStream();
//		var bos = new BufferedOutputStream(bout);
		try
		{
			int i;
			while((i=fin.read())!=-1)
			{
				bout.write((byte)i);
			}
			bout.writeTo(f1);
			bout.writeTo(f2);
			bout.writeTo(f3);
//			bos.write(i);
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
