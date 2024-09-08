package com.may01;

public class CakeMain {

	public static void main(String[] args)
	{
		
		Cake cake = null;
		cake = new OrderedCake();
		cake.showCake();
		
		cake = new OrderedCake("Round", "venilla", 2,"happy Birthday");
		cake.showCake();

	}

}
