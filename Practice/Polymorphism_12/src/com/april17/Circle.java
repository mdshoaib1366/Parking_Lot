package com.april17;

public class Circle extends Shape {

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw()
	{
		System.out.println("Circle Draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Circle Erase");
	}
}
