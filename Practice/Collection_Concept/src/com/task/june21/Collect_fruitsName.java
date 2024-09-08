package com.task.june21;

import java.util.ArrayList;

public class Collect_fruitsName {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("Grapes");
		al.add("palm Granets");
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("banana");
		al1.add("Guava");
		
		al.addAll(2,al1);
		
		System.out.println(al.toString());
		
	}
}
