package com.hos.mana;

public class Cardiology implements HospitalInterface {

	@Override
	public void admitPatient(String patientName, Address address) {
		System.out.println("patientName :"+patientName+" "+address);
	}

	@Override
	public void provideTreatment(String patientName) {
		
		
	}

	@Override
	public void generateBill(String patientName, double amount) {
		// TODO Auto-generated method stub
		
	}

	

}
