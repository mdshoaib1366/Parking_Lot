package com.BufferdStream;

import java.io.*;

public class BufferedInput_Stream {

	public static void main(String[] args) throws IOException {
		var fin = new FileInputStream("c:\\new\\file.txt");
		var bis = new BufferedInputStream(fin);
		
		try(bis;fin)
		{
			int i=0;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println("complete");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
