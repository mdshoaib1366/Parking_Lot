package com.customer.june03;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_MultipleFile {

	public static void main(String[] args)throws IOException ,FileNotFoundException{
		var fin = new FileInputStream("c:\\test\\hello.txt");
		var f1 = new FileOutputStream("c:\\test\\f1.txt");
		var f2 = new FileOutputStream("c:\\test\\f2.txt");
		var f3 = new FileOutputStream("c:\\test\\f3.txt");
		
		var bout = new ByteArrayOutputStream();
		try(f1;f2;f3;fin;bout)
		{
			int i=0;
			while((i=fin.read())!=-1)
			{
				bout.write((byte)i);
			}
			bout.writeTo(f1);
			bout.writeTo(f2);
			bout.writeTo(f3);
			bout.flush();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("success");
	}

}
