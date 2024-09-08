package com.task.april8;

public class Circle {
	protected double radius;

	public Circle() {
		super();
		this.radius = 5;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea()
	{
		if(radius<0)
		{
			return -1;
		}
		else
		{
			return 3.14*radius*radius;
		}
	}
	
}
