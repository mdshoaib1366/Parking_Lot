package com.hos.mana;

public class Patient implements HospitalInterface{
	String disease;
	String address;
	
	public Patient(String disease, String address) {
		super();
		this.disease = disease;
		this.address = address;
	}
	@Override
	public void admitPatient(String patientName, Address address) {
		if(this.disease.equals("Cardiology")) {
			Cardiology cd=new Cardiology();
			
			cd.admitPatient(patientName, address);
		}//else if(this.disease.equals("Orthopedics")) {
//			Orthopedics o=new Orthopedics();
//			
//		}
		
	}
	@Override
	public void provideTreatment(String patientName) {
		System.out.println("patientName :"+patientName+" provideTreatment for this  "+this.disease+" ");
		
	}
	@Override
	public void generateBill(String patientName, double amount) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
