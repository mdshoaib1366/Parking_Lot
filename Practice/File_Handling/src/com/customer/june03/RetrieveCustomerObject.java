package com.customer.june03;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveCustomerObject {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		var fin = new FileInputStream("c:\\test\\CustomerObject.txt");
		var oin = new ObjectInputStream(fin);
		
		try(fin;oin)
		{
			Customer cust=null;
			while((cust=(Customer)oin.readObject()) != null)
			{
				System.out.println(cust);
			}
			
		}
		catch(EOFException e)
		{
//			System.err.println(e.getMessage());
			System.out.println("Complete");
		}
		
	}
}
