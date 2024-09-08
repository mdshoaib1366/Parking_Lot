package com.first;

class Stuff extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread is running....");
		String name = Thread.currentThread().getName();
		System.out.println("child :"+name);
//		System.out.println(10/0);
	}
}
public class ExceptionDemo {
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Stuff s1 = new Stuff();
		Stuff s2 = new Stuff();
		s1.setName("First");
		s2.setName("Second");
		s1.start();
		s2.start();
		
		
		System.out.println("main method Ended");
	}
}
