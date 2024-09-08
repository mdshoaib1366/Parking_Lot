package com.inheritance.multilevel;

public class PCB extends Science {
	protected int bio;

	public PCB(int studentRollNo, String studentName, double studentFee, String studentAddress, int phy, int chem,
			int bio) {
		super(studentRollNo, studentName, studentFee, studentAddress, phy, chem);
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "PCB [bio=" + bio + ", phy=" + phy + ", chem=" + chem + ", studentRollNo=" + studentRollNo
				+ ", studentName=" + studentName + ", studentFee=" + studentFee + ", studentAddress=" + studentAddress
				+ "]";
	}

	
}
