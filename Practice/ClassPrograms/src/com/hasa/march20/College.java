package com.hasa.march20;

public class College {
	private String collegeName;
	private String collegeAddress;

	public College(String collegeName, String collegeAddress) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeAddress=" + collegeAddress + "]";
	}

	
}
