package com.may02.task2;

public interface SIMCardInterface {
	long getPhoneNumber();

	String getnetworkProvider();
	
	boolean isActivated();

	boolean isDeactivated();
}
