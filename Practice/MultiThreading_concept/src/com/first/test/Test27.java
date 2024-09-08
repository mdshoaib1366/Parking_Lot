package com.first.test;

class Test02 implements Runnable
{
	public void run()
	{{
		Thread t6 = new Thread(this,"J2EErr");
		for(int i=0; i<2; i++)
		System.out.println(Thread.currentThread().getName()+" ");
		t6.setPriority(10);
		System.out.println(t6.toString());
	}
	System.out.println();
}}
class Test27
{
	public static void main(String[] args) 
	{
		Test02 t = new Test02();
		Thread t1 = new Thread();
		Thread t2 = new Thread(t,"J2EE");
		Thread t3 = new Thread(t,"J2ME");
		t1.start();t2.start();t3.start();
		System.out.println(t2);

	}
}
