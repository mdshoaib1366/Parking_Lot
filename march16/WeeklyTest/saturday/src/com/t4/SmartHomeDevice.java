package com.t4;

public class SmartHomeDevice {
	private String type;
	private Boolean status;

	public SmartHomeDevice(String type, Boolean status) {
		super();
		this.type = type;
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void turnOn()
	{
		System.out.println(type+" is turned on.");
	}
	public void turnOff()
	{
		System.out.println(type+" is turned off.");
	}
}
