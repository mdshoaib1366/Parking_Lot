package com.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(-1);
		al.add(-2);
		al.add(-5);
		al.add(0);
		al.add(1);
		al.add(2);
		List<Integer> list = al.stream().skip(1).filter(y->y<=0).toList();
		System.out.println(list);
	}
}
