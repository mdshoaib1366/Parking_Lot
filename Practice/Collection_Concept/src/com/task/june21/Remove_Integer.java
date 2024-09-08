package com.task.june21;

import java.util.ArrayList;

public class Remove_Integer {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(Integer.valueOf(10));
		al.add(Integer.valueOf(11));
		al.add(Integer.valueOf(12));
		al.add(Integer.valueOf(13));
		
		System.out.println(al);
		al.remove(1);
		
		System.out.println(al);
		al.remove(Integer.valueOf(13));
		
		System.out.println(al);
	}
}
