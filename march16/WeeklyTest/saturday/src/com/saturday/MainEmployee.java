package com.saturday;

public class MainEmployee extends Employee {

	public MainEmployee(String employeeName,
	 String employeeId,
	 String companyName,
	 String employeeAddress) 
	{
		super( employeeName,
				  employeeId,
				  companyName,
				  employeeAddress);
		
	}

	public static void main(String[] args) {
		MainEmployee me = new MainEmployee("Raj","22NIT0780","Naresh I Technology", "Hyderabad");
		System.out.println(me.getEmployeeName());
		System.out.println(me.getEmployeeId());
		System.out.println(me.getCompanyName());
		System.out.println(me.getEmployeeAddress());
	}
}
