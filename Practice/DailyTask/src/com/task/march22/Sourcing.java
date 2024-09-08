package com.task.march22;

public class Sourcing {
	private int sourceId;
	private String sourceName;
	private double basicSalary;
	private double hra, da, perkPerEnrollment;
	private int enrollmentTarget, enrollmentReached;

	public Sourcing(int sourceId, String sourceName, double basicSalary, double hra, double da,
			double perkPerEnrollment, int enrollmentTarget, int enrollmentReached) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.perkPerEnrollment = perkPerEnrollment;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
	}

	public double calculateGrossSalary() {
		return basicSalary + hra + da + (((enrollmentReached / enrollmentTarget) * 100) * perkPerEnrollment);
	}



	@Override
	public String toString() {
		return "Sourcing [sourceId=" + sourceId + ", sourceName=" + sourceName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + ", perkPerEnrollment=" + perkPerEnrollment + ", enrollmentTarget="
				+ enrollmentTarget + ", enrollmentReached=" + enrollmentReached + "]";
	}

	
	
}
