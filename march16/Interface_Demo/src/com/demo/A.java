package com.demo;

@FunctionalInterface
interface Count
{
	void m1(String s1);

}
//import java.util.Function.*;
public class A
{

	public static void main(String [] args)
	{
		
		Count cat = (s1) -> {
				System.out.println("Count: "+s1.length());
			};
		cat.m1("abcde");
	}
}