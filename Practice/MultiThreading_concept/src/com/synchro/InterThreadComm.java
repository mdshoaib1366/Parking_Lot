package com.synchro;

class SecondThread extends Thread 
{
	    int x = 0;

	    @Override
		public void run() 
		{	
			//Child thread will wait Here for the lock
			synchronized(this) 
			{
				for(int i=1; i<=10; i++)
				{
					x =  x + i;		// 1  3  6  10  15  21  28  35  44  55
				}
				System.out.println("Sending notification");
				notify(); 
				
			}
	 }
} 
public class InterThreadComm
{
public static void main(String [] args) 
{
		SecondThread b = new SecondThread();  
		b.start();

		    synchronized(b) //lock is taken by main Thread  
			{
				//Main thread is suspended by Thread Schedular
				try 
				{
					System.out.println("Waiting for b to complete...");
					b.wait(); //main thread is in wait mode and lock is 
					          //released

					System.out.println("Main thread wake up");
				} 
				catch (InterruptedException e)
				{
				}
				System.out.println("Value is: " + b.x);
			}		
	}
}
