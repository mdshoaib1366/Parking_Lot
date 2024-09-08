package com.sleepDemo;

class Sleep extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i value is :"+i);
			try {
//				Thread.sleep(1000);
				Thread.sleep(0, 999999);
			}
			catch(InterruptedException e)
			{
				System.out.println("thread interrupted"+e);
			}
		}
	}
}
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("main method started");
		Sleep s1 = new Sleep();
		s1.start();
		
		System.out.println("Main method ended");
	}
}
