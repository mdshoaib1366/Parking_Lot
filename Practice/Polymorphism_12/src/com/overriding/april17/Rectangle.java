package com.overriding.april17;

public class Rectangle extends GeometricShape{

	private double width;
	private double length;
	
	public Rectangle()
	{
		super();
		this.width = 10;
		this.length = 10;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
	public double computeArea()
	{
		
		double d = super.area;
		d = width*length;
//		double d = super.computeArea(width, length);
		return d;
	}
	
	public void show() {
		System.out.println("Length: "+length+" Width: "+width+" Rectangle Area: "+computeArea(width,length));
	}
}
