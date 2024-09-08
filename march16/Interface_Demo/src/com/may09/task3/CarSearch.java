package com.may09.task3;

import java.util.function.Predicate;

public class CarSearch {

	public static void main(String[] args) {
		Car c1 = new Car("BMW", 15000, 40000);
		Predicate<Car> c = (c3) -> {
			if(c3.getPrice()>=10000 && c3.getPrice()<=30000 && c3.getMileage()<50000){
				System.out.println(c3);
				return true;  
			}
			else
			{
				System.out.println("Your car is not for sale");
				return false;
			}
				
		};

		System.out.println(c.test(c1));
	}

}
