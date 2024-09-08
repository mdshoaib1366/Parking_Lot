package com.task2.april23;

public class WeatherReportingSystem {
	public static void main(String[] args) {
		WeatherReport w = new HourlyReport(); // Up Casting
		w.generateReport();
		w.generateReport("Lucknow");
		w.generateReport(2024,04,23);
		
		HourlyReport h = (HourlyReport)w; // Down casting
		
		h.generateReport("23-04-2023",15);
		
	}
}
