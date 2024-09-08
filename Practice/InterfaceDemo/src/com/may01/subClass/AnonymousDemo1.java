package com.may01.subClass;

public class AnonymousDemo1 {

	public static void main(String[] args) {
		Super s = new Super()
				{
					@Override
					public void m1()
					{
						System.out.println("Anonymous method called...");
					}
				};
				
				s.m1();

	}

}
