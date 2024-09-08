package com.charcterStream.write;

import java.io.IOException;
import java.io.PrintWriter;

public class File02 {
	 public static void main(String[] args) throws IOException
		{
		  PrintWriter writeData = new PrintWriter("C:\\new\\Roll.txt");

	     try(writeData)
		 {      
	      int roll = 15;
	      //Writing primitive data into text format
	      writeData.printf("My roll number is : %d ", roll);    
	    }
	    catch(Exception e) 
		{
	      e.printStackTrace();
	    }
	  }
}
