package com.coronaVaccineApp;

public class DoseBooking extends Exception{
	private boolean booked;

	public DoseBooking(String name) {
		super(name);
	}
	
	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}

	public boolean bookDose()
	{
		
		try
		{
			
			if(booked) {
				
				throw new DoseBooking("Dose already booked.");
			}
			
		}
		catch(DoseBooking e)
		{
			System.out.println(e.getMessage());
		}
		return booked;
	}
	
	public boolean isDoseBooked()
	{
		
		return booked;
	}
	
	
}
