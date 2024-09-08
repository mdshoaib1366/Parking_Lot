package com.task2;

public class SmartHomeDevice {
	private String type;
	private boolean Status;

	public SmartHomeDevice(String type, boolean status) {
		super();
		this.type = type;
		Status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public void turnOn()
	{
		System.out.println(type+" is turn on");
	}
	public void turnOff()
	{
		System.out.println(type+" is turn off");
	}
}
