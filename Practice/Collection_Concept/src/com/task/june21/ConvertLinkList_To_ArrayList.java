package com.task.june21;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkList_To_ArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> lil = new LinkedList<>();
		lil.addFirst(1);
		lil.addLast(4);
		
		ArrayList<Integer> al = new ArrayList<Integer>(lil);
		
		System.out.println(al);
	}
}
