package com.first;

class Sample extends Thread
{
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i+" By "+name+" child Thread");
		}
	}
}
public class ThreadLoop {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		Sample s1 = new Sample();
		s1.start();
		
		String name = Thread.currentThread().getName();
		for(int i=0; i<=10; i++)
		{
			System.out.println(i+" by "+ name +" Thread");
		}
	}
}
