package com.first;

class MyThread01 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child thread is running");
		String name = Thread.currentThread().getName();
		System.out.println("Running thread name is :"+name);
	}
}

public class UserThread01    
{
	public static void main(String[] args)
	{
		System.out.println("Main Thread started");
		MyThread01 mt = new MyThread01();
		mt.start();
		System.out.println("Main Thread ended");
		
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running ");
	}

}
