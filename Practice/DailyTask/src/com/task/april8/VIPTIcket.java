package com.task.april8;

public class VIPTIcket extends Ticket {
	private String specialAccess;

	public VIPTIcket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	
}
