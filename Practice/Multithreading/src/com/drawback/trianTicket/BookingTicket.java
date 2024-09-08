package com.drawback.trianTicket;

class Person implements Runnable{
	private int availableSeat=1;
	private int wantedSeat;
	
	public Person (int wantedSeat)
	{
		this.wantedSeat = wantedSeat;
	}
	@Override
	public synchronized void run()
	{
		if(availableSeat>=wantedSeat)
		{
			System.out.println("Seat booked for: "+Thread.currentThread().getName());
			availableSeat-=wantedSeat;
			
		}
		else
		{
			System.out.println();
		}
	}
}
public class BookingTicket {
	public static void main(String[] args){
		Runnable s1 = new Person(1);
		
		
		Thread t1 = new Thread(s1,"John");
		Thread t2 = new Thread(s1,"Carlos");
		
		t1.start();
		t2.start();
		
	}
}
