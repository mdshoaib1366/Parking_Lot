package com.may09.task4;

import java.util.Scanner;
import java.util.function.Function;

public class Weather {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temparature in celsius: ");
		double temp = sc.nextDouble();
		
		Function<Double,Double> t = (celsius) -> 
		{
			double kelvin = celsius + 273.15;
			return kelvin;
		};
		System.out.println("Kelvin: "+t.apply(temp));
		
		System.out.println("======================================");
		
		System.out.print("Enter the temparature in fehrenheit: ");
		double temp2 = sc.nextDouble();
		Function<Double,Double> t1 = (fahrenheit) -> {
			
			double celsius = (fahrenheit - 32) * 5/9;
			return celsius;
		};
		sc.close();
		System.out.println("Celsius: "+t1.apply(temp2));
	}
}
