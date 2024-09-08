package com.first.test;

class Test01 implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.stop();
		
		System.out.println(thread.getState());
	}
}
public class MultiThread
{
	public static void main(String[] args) {
		Test01 nit = new Test01();
		Thread thread = new Thread(nit);
		System.out.println("12"+thread.getState());
		thread.start();
		System.out.println("123"+thread.getState());
	}
}
