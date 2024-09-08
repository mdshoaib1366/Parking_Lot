package com.IdentityHashMap.test;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo1
{
	public static void main(String[] args) 
	{
		Map<String, String> tm = new TreeMap<String, String>();
		tm.put("one", "1");
		tm.put("two", "2");
		tm.put("three", null);
		tm.put("four", "4");
		
		System.out.println(tm);
		
		SortedMap x = (SortedMap)tm;
		
		System.out.println("first key: "+x.firstKey());
		System.out.println("first key: "+x.lastKey());
		System.out.println("first key: "+x.headMap("three"));
		System.out.println("first key: "+x.tailMap("three"));
		System.out.println("first key: "+x.subMap("one", "two"));
		
	}
	
	
}
