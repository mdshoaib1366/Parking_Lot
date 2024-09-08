package com.sleepDemo;

public class AnonymousThreadWithReference {
	public static void main(String[] args) {
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println("Running thread is: "+name);
			}
		};
		t1.start();
//		t1.run();
		String name = Thread.currentThread().getName();
		System.out.println("Running thread is: "+name);
		
	}
}
