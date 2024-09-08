package com.task2.april23;

public class Video extends Media {

	String format;

	public Video(String title, int duration, String format) {
		super(title, duration);
		this.format = format;
	}
	
	@Override
	public Video getDetails()
	{
		System.out.println("Title: "+super.getTitle()+", Duration: "+super.getDuration()+", Format: "+this.format);

		return new Video(super.getTitle(),super.getDuration(),this.format);
	}
}
