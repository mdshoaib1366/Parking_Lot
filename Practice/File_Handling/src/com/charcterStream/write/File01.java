package com.charcterStream.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) throws IOException{
		var filename = "c:\\new\\append.txt";
		var fileWriter = new FileWriter(filename,true);
		var bufferedWriter = new BufferedWriter(fileWriter);
		try(fileWriter;bufferedWriter)
		{
			String s1 = "My name is Khan.";
			 bufferedWriter.write(s1);	
			 
			 bufferedWriter.newLine();
			 
			 s1 = "I lives in hyderabad";
	         bufferedWriter.write(s1);

	         System.out.println("Text appended successfully to the file.");
		}
		catch(IOException e)
		{
            System.out.println("An error occurred while appending the text to the file: " + e.getMessage());
		}
	}
}
