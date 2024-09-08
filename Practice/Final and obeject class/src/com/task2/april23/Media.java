package com.task2.april23;

public class Media {
	private String title;
	private int duration;

	public Media(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

	public Media getDetails()
	{
		System.out.println("Title: "+this.title+" \nDuration: "+this.duration);
		return new Media(title,duration);
	}
}
