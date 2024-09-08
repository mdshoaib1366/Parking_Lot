package com.july1.task;

import java.util.ArrayList;
import java.util.List;

public class HospitalFinder {
	public static void main(String[] args) {
		List<String> listOfTreatments = new ArrayList<String>();
		listOfTreatments.add("Cardiac");
		listOfTreatments.add("ENT");
		listOfTreatments.add("Ortho");
		listOfTreatments.add("Pediatric ");
		listOfTreatments.add("Gastro");
		
		Hospital h1 = new Hospital("Yashoda",listOfTreatments,"MATHEWS", "9848222222", "Sec");
//		HospitalService hs = new HospitalService(h1);

	}
}
