package com.task.april8;

public class StudentTicket extends Ticket{

	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	
	
}
