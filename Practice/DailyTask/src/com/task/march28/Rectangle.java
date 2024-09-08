package com.task.march28;

public class Rectangle {
	private double width;
	private double height;
	
	{
		width=0;
		height=0;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width*height;
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5, 10);
		System.out.println("Area of Rectangle: "+rec.getArea());
		
		System.out.print("Perimeter of Ractangle: "+rec.getPerimeter());
		
	}
}
