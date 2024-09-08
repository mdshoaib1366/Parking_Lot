package com.t4;

public class ThermostatDevice extends SmartHomeDevice{
	
	public ThermostatDevice() {
		super("Heater",true);
	}
	
	public void setTemperature(int temperature) {
		System.out.println("Thermostat temperature is set to " + temperature + "°C.");
	}
}
