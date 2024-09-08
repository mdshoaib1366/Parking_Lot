package com.shoaib.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) throws IOException {
      var fout = new FileOutputStream("c:\\new\\batch30.txt");
		var fin = new FileInputStream("c:\\new\\batch30.txt");
		try(fin;)
		{
//			String s = "Hello World.";
//			byte b[] = s.getBytes();
//			fout.write(b);
			int i=0;
			while(true){
				 i = fin.read();
				if(i==-1)
				break;
				System.out.println((char)i);
				
			}
			
			System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
