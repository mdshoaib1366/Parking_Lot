package com.task2.april23;

public class WeatherReport {
	public void generateReport() {
		System.out.println("generic weather report.");
	}

	public void generateReport(String location) {
		System.out.println("Location: " + location);
	}

	public void generateReport(int year, int month, int day) {
		System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
	}

}
