package com.june27.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CustomerMain {
	public static void main(String[] args) {
		ArrayList<Customer> al = new ArrayList<>();
		al.add(new Customer(112, "Tina", 12000.5));
		al.add(new Customer(114, "Lana", 55000.5));
		al.add(new Customer(111, "Mia", 22000.5));
		al.add(new Customer(113, "Angilna while", 32000.5));
		
		Comparator<Customer> con = new Comparator<Customer>() {
			
			@Override
			public int compare(Customer ob1, Customer ob2) {
				
				return ob1.getCustomerNumber().compareTo(ob2.getCustomerNumber());
			}
		};
		
		Collections.sort(al, con);
		al.forEach(System.out::println);
		System.out.println("=============================================================================");
		
		Comparator<Customer> con2 = new Comparator<Customer>() {
			
			@Override
			public int compare(Customer ob1, Customer ob2) {
				
				return ob1.getCustomerName().compareTo(ob2.getCustomerName());
			}
		};
		
		Collections.sort(al, con2);
		al.forEach(System.out::println);
		
		System.out.println("=============================================================================");
		Comparator<Customer> con3 = new Comparator<Customer>() {
			
			@Override
			public int compare(Customer ob1, Customer ob2) {
				
				return ob1.getCustomerBill().compareTo(ob2.getCustomerBill());
			}
		};
		
		Collections.sort(al, con3);
		al.forEach(System.out::println);
	}
}
