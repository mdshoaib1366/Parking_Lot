package com.unboxing;

public class BufferTest {
	public static void main(String[] args) 
	{		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1==i2); //true

		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3==i4); //false

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5.equals(i6)); //true
	}

}
