package com.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo1 {
	public static void main(String[] args) {
		Consumer<Integer> num = x -> System.out.println(x);
		num.accept(12);
		
		Consumer<String> c1 = str -> System.out.println(str);
		c1.accept("hello");
	}
}
