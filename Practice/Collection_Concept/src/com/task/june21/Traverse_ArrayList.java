package com.task.june21;

import java.util.ArrayList;
import java.util.ListIterator;

public class Traverse_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(14);
		al.add(5);
		al.add(14);
//		System.out.println(al.lastIndexOf(14));
		
		System.out.println(al.remove(2));
		System.out.println(al.remove(Integer.valueOf(13)));
		
		
		
		ListIterator<Integer> lil = al.listIterator();
		while(lil.hasNext())
		System.out.print(lil.next()+" ");
		
		System.out.println();
		while(lil.hasPrevious())
			System.out.print(lil.previous()+" ");
		
	}
}
