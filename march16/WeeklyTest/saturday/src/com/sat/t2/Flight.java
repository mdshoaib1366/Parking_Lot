package com.sat.t2;

public class Flight {
	private String name;
	private String type;
	private String company;

	public Flight(String name, String type, String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Flight [name=" + name + ", type=" + type + ", company=" + company + "]";
	}

	
}
