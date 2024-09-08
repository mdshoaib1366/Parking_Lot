package com.iq.important;

abstract class Alpha {
	public abstract void show();
	public abstract void demo();
	
}

abstract class Beta extends Alpha
{
	public void show()
	{
		System.out.println("Show method implement in Beta class");
	}
}

class Gamma extends Beta
{
	public void demo()
	{
		System.out.println("demo Method implement in Gamma class");
	}
}

public class AbstractDemoIQ{
	public static void main(String[] args) {
		Gamma g = new Gamma();
		g.show();
		g.demo();
	}
}