package com.customer.june03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreCustomerObject {
	public static void main(String[] args)throws IOException {
		
		var fos =  new FileOutputStream("c:\\test\\CustomerObject.txt");
		var oos = new ObjectOutputStream(fos);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter object you want: ");
		try(fos;oos;sc)
		{
			int choice = sc.nextInt();
			for(int i=1; i<=choice; i++)
			{
				Customer cust = Customer.getCustomerObject();
				oos.writeObject(cust);
				
			}
			System.out.println("complete...");
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
}
