package com.june01.task;

public class Order {

	public static void main(String[] args) {
		
		CoffeeOrder c1 = new CoffeeOrder(CoffeeType.milk_coffee, CoffeeSize.Big);
		String order = c1.getOrderDetails();
		System.out.println(order);

	}

}
