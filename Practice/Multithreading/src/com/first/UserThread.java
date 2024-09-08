package com.first;

class MyThread extends Thread{
	@Override
	public void run()
	{
		System.out.println("child thread is running...");
	}
}
public class UserThread {
	public static void main(String[] args) {
		System.out.println("Main method started");
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("Main method ended");
	}
}
