package com.demos;

import java.util.*;
public class     Test
{
	public static void main(String[] args) {
    SortedSet<Integer> set = new TreeSet<>();
    set.add(7);
    set.add(-12);
    SortedSet<Integer> sub = set.subSet(-100, 100);
    System.out.println(sub);
    sub.add(9);
    System.out.format("%d %d", set.size(), sub.size());
}
}
