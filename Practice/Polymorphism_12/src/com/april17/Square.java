package com.april17;

public class Square extends Shape {

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw()
	{
		System.out.println("Square Draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Square Erase");
	}
}
