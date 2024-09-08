package com.t4;

public class LightDevice extends SmartHomeDevice{

	
	public LightDevice() {
		super("Light",true);
		
	}

	public void dim(int brightness)
	{
		System.out.println("Light brightness is set to " + brightness + "%.");
	}
	
}
