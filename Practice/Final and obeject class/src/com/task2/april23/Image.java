package com.task2.april23;

public class Image extends Media {
	 String resolution;

	public Image(String title, int duration, String resolution) {
		super(title, duration);
		this.resolution = resolution;
	}
	
	@Override
	public Image getDetails()
	{
	//	System.out.println("Title: "+super.getTitle()+", Duration: "+super.getDuration()+", Resolution: "+this.resolution);
		
		super.getDetails();
		System.out.println("RESOLUTION : "+this.resolution);
		return new Image(super.getTitle(),super.getDuration(),this.resolution);
	}
	
}
