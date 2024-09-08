package com.may01.task2;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the numberOfFood: ");

		 int numberOfFood = sc.nextInt();
		 Food food = null;
		 
		 switch(numberOfFood)
		 {
		 case 1: food = new Egg(4,1.9,12.3);
//			 System.out.println(food.getClass().getSimpleName()+" is ");
			 food.getMacroNutrients(); 
			 //System.out.println(food.getTastyScore());
			 break;
		 
		 case 2: food = new Bread(3,2.9,11.7);
//			 System.out.println(food.getClass().getSimpleName()+" is ");
			 food.getMacroNutrients();
			 break;
			 
		default: System.out.println("sorry! input is invalid");
		 }
		 
	}
}
