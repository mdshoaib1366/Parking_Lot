package com.inheritance.multilevel;

public class Science extends Student {
	protected int phy;
	protected int chem;

	public Science(int studentRollNo, String studentName, double studentFee, String studentAddress, int phy, int chem) {
		super(studentRollNo, studentName, studentFee, studentAddress);
		this.phy = phy;
		this.chem = chem;
	}

}
