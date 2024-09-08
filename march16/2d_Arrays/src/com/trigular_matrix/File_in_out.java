package com.trigular_matrix;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class File_in_out {
	public static String getString(FileInputStream f2) throws IOException
	{
		int i =0;
		while((i=f2.read())!=-1)
		{
			Character arr[] = new Character[4];
			int temp=0;
			while(':'==i)
				arr[0]=(char)i;
//			System.out.print((char)i);
			System.out.println(Arrays.toString(arr));
		}
		return null;
	}
	public static void main(String[] args) {
		
		try {
			var file = new FileInputStream("c:\\new\\file01.txt"); 
			
			System.out.println(File_in_out.getString(file));
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	
	}
}
