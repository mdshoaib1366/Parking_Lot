package com.coronaVaccineApp;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;

	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}

	public void isEligible()
	{
		eligibility.isEligible();
	}
	
	public void bookDose() 
	{
		
		if(eligibility.isEligible())
		{
			System.out.println("Dose booked successfully for "+name);
		}
		else
		{
			try
			{
				throw new VaccineEligibility(name+" is not eligible for the vaccine.");
			}
			catch(VaccineEligibility e)
			{
				System.out.println(e.getMessage());
			}
//			System.out.println(name+" is not eligible for the vaccine.");
		}
	}
	
	public void isDoseBooked()
	{
		if(doseBooking.isDoseBooked())
		{
			System.out.println();
		}
		else {
			doseBooking.
		}
		doseBooking.isDoseBooked();
	}
}
