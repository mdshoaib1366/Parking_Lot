package com.april17;

public class Shape {
	
	public Shape() {
		super();
	}
	public static Shape randshape()
	{
		int x = (int)(Math.random()*3);
		switch (x) 
		{
		case 0:  return new Circle() ;
		case 1:  return new Square() ;
		case 2:  return new Triangle();
		default: return new Shape();
		}
	}
	
	public void draw()
	{
		System.out.println("Shape Draw...");
	}
	public void erase()
	{
		System.out.println("Shape Erase...");
	}

}
