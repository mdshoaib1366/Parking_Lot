package com.may02.task2;

public class BSNL implements SIMCardInterface {
	private long number = (long) (Math.random()*1000000001);
	
	@Override
	public long getPhoneNumber() {
		return number;
	}

	@Override
	public String getnetworkProvider() {
		
		return this.getClass().getSimpleName();
	}

	@Override
	public boolean isActivated() {
		
		return true;
	}

	@Override
	public boolean isDeactivated() {
		
		return false;
	}
	
}
