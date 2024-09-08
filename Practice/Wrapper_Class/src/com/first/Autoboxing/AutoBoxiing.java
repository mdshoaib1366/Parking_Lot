package com.first.Autoboxing;

public class AutoBoxiing {
	public static void main(String[] args) 
	{
			Integer a = Integer.valueOf(15);
			
			Integer b = Integer.valueOf("25");

            Integer c = Integer.valueOf("111",16); //Here Base we can take upto 36

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

			System.out.println(Character.MAX_RADIX);
	}

}
