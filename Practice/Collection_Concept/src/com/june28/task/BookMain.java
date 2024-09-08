package com.june28.task;

import java.util.*;

record Book(String name,String author) implements Comparable<Book>
{

	@Override
	public int compareTo(Book o) {
		
		return this.name.compareTo(o.name);
	}
	
}
public class BookMain {
	public static void main(String[] args) {
		TreeSet<Book> ts = new TreeSet<Book>();
		ts.add(new Book("Java","james gosline"));
		ts.add(new Book("C","Neil"));
		ts.add(new Book("Python","Ben"));
		ts.add(new Book("Dot net","tim"));
		ts.add(new Book("Ruby","james gosline"));
		
		ts.forEach(System.out::println);
	}
}
