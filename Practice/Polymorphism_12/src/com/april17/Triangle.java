package com.april17;

public class Triangle extends Shape {
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw()
	{
		System.out.println("Triangle Draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Triangle Erase");
	}
}
