package com.first.test;

class Mythead extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<=4; i++) {
			
		System.out.println(i+" "+Thread.currentThread().getId());
		try {
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("End");
	}
}
public class Test {
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Line 1");
		Mythead mt = new Mythead();
		System.out.println("thead name: "+Thread.currentThread().getName());
		Mythead m2 = new Mythead()
		{
			
			@Override
			public void run()
			{
				for(int i=1; i<5; i++)
				System.out.println("i value"+i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		System.out.println("Last");
		try {
//			Thread.sleep(2000);
			mt.start();
			mt.join(3000);
			m2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

