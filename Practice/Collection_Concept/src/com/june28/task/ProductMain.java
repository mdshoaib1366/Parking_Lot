package com.june28.task;

import java.util.*;

record Product(int pid,String pname) {
	public Product
	{
		if(pid<=0)
		{
			throw new IllegalArgumentException("pid is -ve or zero");
		}
	}
}
public class ProductMain {
	public static void main(String[] args) {
//		Comparator<Product> c = new Comparator<Product>() {
//			
//			@Override
//			public int compare(Product o1, Product o2) {
//				// TODO Auto-generated method stub
//				return o1.pid()-o2.pid();
//			}
//		};
		System.out.println("Based on pid (Increasing order)");
		TreeSet<Product> ts = new TreeSet<>((p1,p2)->p1.pid()-p2.pid());
		ts.add(new Product(11,"phone"));
		ts.add(new Product(10,"Laptop"));
		ts.add(new Product(14,"shoes"));
		ts.add(new Product(13,"Buds"));
		ts.forEach(System.out::println);
		
		System.out.println("Based on pid (decreasing order)");
		TreeSet<Product> ts1 = new TreeSet<>((p1,p2)->p2.pid()-p1.pid());
		ts1.add(new Product(11,"phone"));
		ts1.add(new Product(10,"Laptop"));
		ts1.add(new Product(14,"shoes"));
		ts1.add(new Product(13,"Buds"));
		System.out.println(ts1.toString());
		
		System.out.println("Based on pname ALphabetical order");
		TreeSet<Product> ts2 = new TreeSet<>((p1,p2)->p1.pname().compareTo(p2.pname()));
		ts2.add(new Product(11,"phone"));
		ts2.add(new Product(10,"Laptop"));
		ts2.add(new Product(14,"shoes"));
		ts2.add(new Product(13,"Buds"));
		ts2.forEach(i -> System.out.println(i));
		
		System.out.println("Based on pname (decreasing order)");
		TreeSet<Product> ts3 = new TreeSet<>((p1,p2)->p2.pname().compareTo(p1.pname()));
		ts3.add(new Product(11,"phone"));
		ts3.add(new Product(10,"Laptop"));
		ts3.add(new Product(14,"shoes"));
		ts3.add(new Product(13,"Buds"));
		System.out.println(ts3.toString());
	}
}
