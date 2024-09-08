package com.task.june21;

import java.util.ArrayList;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		int temp=0;
		for(int i=al.size()-1; i>0; i--)
		{
//			System.out.print(i+" ");
			Integer ele = al.get(i);
//			System.out.println(ele);
			al.set(temp, ele);
			temp++;
		}
		System.out.println(al);
	}
}
