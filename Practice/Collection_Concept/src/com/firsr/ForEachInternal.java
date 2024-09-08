package com.firsr;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachInternal {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		
		//Anonymous inner class
//		Consumer<String> cons = fruit -> System.out.println(fruit.toUpperCase()); 
		
//		Consumer<String> cons = new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t.toUpperCase());
//			}
//		};
		
//		fruits.forEach(cons);
		
		
		fruits.forEach(System.out::println);
	}

}
