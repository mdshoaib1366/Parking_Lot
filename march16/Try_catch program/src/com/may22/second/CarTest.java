package com.may22.second;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("please choose your problem:");
		System.out.println("1) car stop.\n2) car heated.\n3) car punctured and heated. \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose any one option:");
		int choose = sc.nextInt();
//		CarTest c = new CarTest();		
		if(choose==1) {
			try {
				CarClass.stop("stop");
			}
			catch (CarStopped e) {
				System.err.println(e.getMessage());
			}
		}
		else if(choose==2)
		{
			try{
				CarClass.heat(70);
				
			}
			catch(CarHeat e)
			{
				System.err.println(e.getMessage());
			}
			
		}
		else if(choose==3)
		{
			try {
				CarClass.puncture("puncture");
			}
			catch(CarPuncture e)
			{
				System.err.println(e.getMessage());
			}
		}
		
	}
}
