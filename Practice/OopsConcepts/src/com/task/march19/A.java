package com.task.march19;

public class A {
	private int data = 15;
	public A()
	{
		new B(this).display();
	}
	
	public void show()
	{
		
		System.out.println("Data: "+this.data);
	}
}
