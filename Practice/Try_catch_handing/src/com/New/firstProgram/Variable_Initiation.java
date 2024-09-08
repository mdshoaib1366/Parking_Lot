package com.New.firstProgram;

public class Variable_Initiation {
	public static void main(String[] args) {
		
		try {
			int x=90/2;
			int arr[]= {1,2,3,4};
			System.out.println(arr[30]);
		}
		catch(Exception e)
		{
			
//			System.out.println(e.getCause());
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			System.out.println(e.getClass());
			e.printStackTrace();
			}
	}
}
