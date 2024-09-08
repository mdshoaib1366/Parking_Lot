package com.Employee_Details;


public class EmpBean{
	private String id;
	private String name,address,gender,hobby,state;
	private double salary;
	
	public EmpBean()
	{
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpBean [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", hobby="
				+ hobby + ", state=" + state + ", salary=" + salary + "]";
	}
	
}
