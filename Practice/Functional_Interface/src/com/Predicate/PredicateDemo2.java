package com.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		Predicate<String> p2 = str -> str.equals("LKO");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter place name: ");
		String name = sc.nextLine();
		System.out.println(p2.test(name));
		
		
	}
}
