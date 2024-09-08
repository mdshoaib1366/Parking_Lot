package com.BufferdStream;

import java.io.*;

public class BufferdInputSteam01 {
	public static void main(String[] args) throws IOException{
		var fos = new FileOutputStream("c:\\new\\file.txt");
		var bos = new BufferedOutputStream(fos);
		
		try(fos;bos)
		{
			String s = "Lucknow boy";
			byte b[] = s.getBytes();
			bos.write(b);
			System.out.println("Done");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
