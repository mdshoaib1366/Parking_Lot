package com.IdentityHashMap.test;

import java.util.*;
public class Demo1 
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> hm = new HashMap<>();
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<String, Integer>();
		
		
		hm.put("Ravi", 11);
		hm.put(new String("Ravi"), 13);
		
		ihm.put("Ravi", 11);
		ihm.put(new String("Ravi"), 13);

		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(ihm);
		System.out.println(ihm.size());
		
		
//		String st1 = "abc";
//		String st2 = new String("abc");
//		Integer i1 = 120;
//		Integer i2 = 120;
//		
//		System.out.println(System.identityHashCode(i1));
//		System.out.println(System.identityHashCode(i2));
	}

}
