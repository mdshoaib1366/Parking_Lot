package com.Predicate;

import java.util.function.*;

public class PredicateDemo1 {
	public static void main(String[] args) {
		
		//find odd or even
		Predicate<Integer> p = x -> x%2==0;
		
		System.out.println(p.test(36));
		System.out.println(p.test(21));
	}
}
