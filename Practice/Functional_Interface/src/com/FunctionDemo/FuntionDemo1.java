package com.FunctionDemo;

import java.util.function.Function;

public class FuntionDemo1 {
	public static void main(String[] args) {
		// find square 
		Function<Integer,Integer> fn1 = x->x*x;
		System.out.println(fn1.apply(12));
		
		
	}
}
