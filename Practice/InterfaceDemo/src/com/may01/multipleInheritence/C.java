package com.may01.multipleInheritence;

public class C implements A,B{
	@Override
	public void m1()
	{
		System.out.println("Overridden Method");	
		  A.super.m1();
		  B.super.m1();
	}
}
