package com.first;


class Foo extends Thread
{
	@Override
	public void run() {
		System.out.println("Child Thread is running with separate stack");
		
	}
	
}
public class IsAliveDemo {
	public static void main(String[] args) {
		Foo f1= new Foo();
		System.out.println("Is thread started before start :"+f1.isAlive());
		f1.start();
		System.out.println("Is thread started after start :"+f1.isAlive());
		f1.start();
	}
}
