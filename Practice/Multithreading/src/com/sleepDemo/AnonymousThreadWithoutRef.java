package com.sleepDemo;

public class AnonymousThreadWithoutRef {
	public static void main(String[] args) 
	{
		//Anonymous inner class without reference
		new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
			    System.out.println("Running thread name is :"+name);	
			}
			
		}.start();
	}
}
