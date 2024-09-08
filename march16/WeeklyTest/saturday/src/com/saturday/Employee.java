package com.saturday;

public class Employee {
	private String employeeName;
	private String employeeId;
	private String companyName;
	private String employeeAddress;

	public Employee(String employeeName, String employeeId, String companyName, String employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.companyName = companyName;
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
