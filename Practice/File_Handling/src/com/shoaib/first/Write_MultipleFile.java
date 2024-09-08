package com.shoaib.first;

import java.io.*;

public class Write_MultipleFile {
	public static void main(String[] args) throws IOException {
		var fin = new FileInputStream("C:\\Users\\moham\\Desktop\\Hello.txt");
		byte[] allBytes = fin.readAllBytes();
		var fout1 = new FileOutputStream("C:\\new\\a1.txt"); 
		fout1.write(allBytes);
		var fout2 = new FileOutputStream("C:\\new\\b2.txt");
		fout2.write(allBytes);
		var fout3 = new FileOutputStream("C:\\new\\c3.txt");
		fout3.write(allBytes);
		
		var bout = new ByteArrayOutputStream();
		
		try(fin;fout1;fout2;fout3;bout)
		{
			int i;
			while((i=fin.read())!=-1)
			{
				bout.write((byte)i);
			}
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			bout.writeTo(fout3);
			bout.flush();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
