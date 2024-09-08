package com.coronaVaccineApp;

public class CoronaVaccineApp {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			VaccineEligibility eligibility = new VaccineEligibility(23, true);
			DoseBooking booking = new DoseBooking(true);
			User u1 = new User("John",eligibility,booking);
			
			public void run()
			{
				u1.isDoseBooked();
				
			}
		};
		t1.start();
		
		Thread t2 = new Thread(){
			VaccineEligibility eligibility = new VaccineEligibility(23, true);
			DoseBooking booking = new DoseBooking(true);
			User u1 = new User("Sam",eligibility,booking);
			
			public void run()
			{
				u1.isDoseBooked();
			}
		};
		t2.start();
		
		
	}
}
