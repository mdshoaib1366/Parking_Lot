package com.coronaVaccineApp;

public class VaccineEligibility extends Exception{
	private int age;
	private boolean hasHealthCondition;

	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public VaccineEligibility(String message)
	{
		super(message);
	}

	public VaccineEligibility() 
	{
		super();
	}
	
	public boolean isEligible()
	{
		if((age>18 && age<=60) && hasHealthCondition)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
