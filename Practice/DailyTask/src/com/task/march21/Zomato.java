package com.task.march21;

public class Zomato {

	public static void main(String[] args) {
//		Order order = new Order(121,"Birayani",300);
//		
//		Customer customer = new Customer(232,"Md Shoaib","Ameerpet",order);
		
		Customer customer = new Customer(232,"Shoaib","ameerpet",new Order(121,"Burger",130));
		
		System.out.println(customer);
	}

}
