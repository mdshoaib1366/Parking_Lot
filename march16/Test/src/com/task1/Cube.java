package com.task1;

import java.util.function.Supplier;

public class Cube {

	public static void main(String[] args) {
		 Supplier<Integer> s = ()-> {
			 int i=5;
			 return i*i;
		 };
		 System.out.println(s.get());
		 
		 Supplier<Integer> cube = ()-> {
			 int i=5;
			 return i*i*i;
		 };
		 System.out.println(cube.get());
	}

}
