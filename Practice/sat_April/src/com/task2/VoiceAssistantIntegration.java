package com.task2;

public class VoiceAssistantIntegration extends SmartHomeDevice{

	public VoiceAssistantIntegration(String type, boolean status) {
		super(type, status);
		
	}

	public void executeVoiceCommand(String s)
	{
		if(s=="turn on")
		{
			turnOn();
		}
		else if(s=="turn off")
		{
			turnOff();
			
		}
		else if(s=="dim")
		{
			System.out.println("Adjusting brightness...");
		}
		else if(s=="set temperature")
		{
			System.out.println("Setting temperature...");
		}
		else
		{
			System.out.println("Command not recognized.");
		}
	}
	
}
