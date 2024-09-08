package com.overriding.april17;

public class GeometricShape {
	String shapeType;
	double area;

	public GeometricShape() {
		super();
		this.shapeType = null;
		this.area = 0;
	}
	
	public double computeArea(double value1, double value2)
	{
		double area = value1*value2;
		return area;
	}
	
	public void show()
	{
//		area=this.computeArea(10, 10);
		System.out.println("ShapeType: "+this.shapeType+"Area: "+this.area);
	}
}
