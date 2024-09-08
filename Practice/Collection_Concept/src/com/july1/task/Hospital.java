package com.july1.task;

import java.util.*;

public class Hospital {
	private int hospitalCode=100;
	private String hospitalName;
	private List<String> ListOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;

	public Hospital( String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {
		super();
		
		this.hospitalName = hospitalName;
		ListOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;hospitalCode++;
	}

	public int getHospitalCode()
	{
		return hospitalCode;
	}
	
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return ListOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		ListOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", ListOfTreatments="
				+ ListOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}


	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
