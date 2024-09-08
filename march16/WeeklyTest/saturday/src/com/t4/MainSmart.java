package com.t4;

public class MainSmart {
	public static void main(String[] args) {
		LightDevice l = new LightDevice();
		l.turnOn();
		l.dim(90);
		
		ThermostatDevice t = new ThermostatDevice();
		t.turnOn();
		t.setTemperature(22);
		l.turnOff();
		t.turnOff();
	}
}
