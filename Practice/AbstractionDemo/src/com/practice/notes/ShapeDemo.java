package com.practice.notes;

abstract class Shape {
	public abstract void draw();
}

class Rectangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Square...");
	}
}

class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Circle...");
	}
}

public class ShapeDemo
{
	public static void main(String[] args) {
		Shape shape = null;
		shape = new Rectangle();
		shape.draw();
		shape = new Square();
		shape.draw();
		shape = new Circle();
		shape.draw();
		
		
	}
}


