package com.Consumer;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		//finding length of String
		Function<String,Integer> fn2 = str -> str.length();
		System.out.println(fn2.apply("Lucknow"));
		

	}

}
