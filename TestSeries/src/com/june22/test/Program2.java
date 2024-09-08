package com.june22.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(4);
		al.add(7);
		al.add(1);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
