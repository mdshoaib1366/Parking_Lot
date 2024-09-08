package com.task.april8;

public class MainTicket {
	public static void main(String[] args) {
		Ticket t = new Ticket("Concert", 101, 50.0);
		System.out.println("Event: "+t.getEventName());
		System.out.println("Seat Number: "+t.getSeatNumber());
		System.out.println("Price: "+t.getPrice());
		System.out.println();
		VIPTIcket vip =  new VIPTIcket("VIP Concert", 201, 100.0, "BackStage Access");
		System.out.println("Event: "+vip.getEventName());
		System.out.println("Seat Number: "+vip.getSeatNumber());
		System.out.println("Price: "+vip.getPrice());
		System.out.println("Special Access: "+vip.getSpecialAccess());
		System.out.println();
		StudentTicket st = new StudentTicket("Stuent Event", 301, 30.0, true);
		System.out.println("Event: "+st.getEventName());
		System.out.println("Seat Number: "+st.getSeatNumber());
		System.out.println("Price: "+st.getPrice());
		System.out.println("Student isCount: "+st.isStudentDiscount());
		
	}
}
