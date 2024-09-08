package com.task.april8;

public class Cylinder extends Circle{
	protected double height;

	public Cylinder() {
		super();
		this.height = 5;
	}

	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
		
	}
	
	public double getVolume()
	{
		if(height<0)
		{
			return -1;
		}
		else
		{
			return 3.14*(super.radius*super.radius*height);
		}
	}
	
}
