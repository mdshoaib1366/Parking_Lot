package com.may03.task2;

public interface HospitalInterface {
	void admitPatient(String patientName, Address address);
	void provideTreatment(String patientName);
	void generateBill(String patientName, double amount);
	
}
