package com.lab_task.april01;

public class Movie {
	private String title;
	private int releaseyear;
	private String genre;

	public Movie(String title, int releaseyear, String genre) {
		super();
		this.title = title;
		this.releaseyear = releaseyear;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", releaseyear=" + releaseyear + ", genre=" + genre + "]";
	}

	
}
