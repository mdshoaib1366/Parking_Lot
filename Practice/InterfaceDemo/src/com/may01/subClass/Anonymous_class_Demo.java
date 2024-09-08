package com.may01.subClass;

public class Anonymous_class_Demo {

	public static void main(String[] args) {
		Vehicle car = new Vehicle()
				{
					@Override
					public void run(){
						System.out.println("Car is running..");
					}
				};
				car.run();
				
		Vehicle bike = new Vehicle()
				{
					@Override
					public void run(){
						System.out.println("Bike is running...");
					}
				};
				bike.run();
	}

}
