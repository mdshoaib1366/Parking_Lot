package com.task2;

public class Main {

	public static void main(String[] args) {
		VoiceAssistantIntegration v = new VoiceAssistantIntegration("Voice Assitant", false);
		v.executeVoiceCommand("turn on");
		v.executeVoiceCommand("set temperature");
		v.executeVoiceCommand("dim");
		v.executeVoiceCommand("turn off");
	}
}
