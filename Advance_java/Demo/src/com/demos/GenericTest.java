package com.demos;

import java.util.*;

class NareshIT<T>
{
	
}
public class GenericTest{
	public static void main(String[] args) {	
		NareshIT<String> str = new NareshIT();
		NareshIT<Float> flo = new NareshIT();
		System.out.println(str.getClass().equals(flo.getClass()));
		System.out.println(str.equals(flo));
		
		System.out.println(new String("HO").getClass());
		System.out.println(new Float(12F).getClass());
	}
}
