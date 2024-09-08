package com.constructor;

public class Sample {
	void m1(long t)
	{
		System.out.println("Int");
	}
	public void m1(double t)
	{
		System.out.println("double");
	}
	public void m1(Number t)
	{
		System.out.println("Number");
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1(423454568);
	}
}
