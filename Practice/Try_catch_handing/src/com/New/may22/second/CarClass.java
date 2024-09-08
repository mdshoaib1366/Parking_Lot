package com.New.may22.second;

public class CarClass {
	public static void stop(String message) throws CarStopped
	{
		if(message.equals("stop")){
			throw new CarStopped("Break applied");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
	
	public static void puncture(String message) throws CarPuncture
	{
		if(message.equals("puncture"))
		{
			throw new CarPuncture("Car is punctured");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
	
	public static void heat(int temp) throws CarHeat
	{
		if(temp>50)
		{
			throw new CarHeat("Car is heated more the 50 degrees");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
}
