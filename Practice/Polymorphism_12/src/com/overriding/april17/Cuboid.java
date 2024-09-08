package com.overriding.april17;

public class Cuboid extends Rectangle{
	private double height;

	public Cuboid()
	{
		this.height = 15;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
//	public double computeArea(double width, double length, double height)
//	{
//		double ar = super.computeArea(width, length)*height;
//		return ar;
//	}
	public double computeArea()
	{
		double ar = super.computeArea(super.getWidth(), super.getLength())*height;
		return ar;
	}
	
	
	public void show()
	{
		System.out.println("Width: "+getWidth()+"Length: "+getLength()+"Height: "+this.height+"Area of Cuboid: "+computeArea());
	}
}
