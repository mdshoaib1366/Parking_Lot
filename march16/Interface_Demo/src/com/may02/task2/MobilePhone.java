package com.may02.task2;

public class MobilePhone implements MobilePhoneInterface {
	
	private boolean isActive;
	
	public MobilePhone() {
		super();
		
	}

	@Override
	public void insertSim(SIMCardInterface sim) {
		
		isActive = sim.isActivated();
		System.out.println(sim.getnetworkProvider() + " Sim is inserted");
		
	}

	@Override
	public void removeSim(SIMCardInterface sim) {
		isActive = sim.isDeactivated();
		System.out.println(sim.getnetworkProvider()+ " Sim is removed");
;	}

	@Override
	public void makeCalls(SIMCardInterface sim) {
		if (isActive) {
			System.out.println("Calling from number : " + sim.getPhoneNumber());
			System.out.println("Calling from network : " + sim.getnetworkProvider());
		} else {
			System.out.println("Sim is not activated....");
		}
	}

	@Override
	public void sendText(SIMCardInterface sim) {
		if (isActive) {
			System.out.println("Messaging from number : " + sim.getPhoneNumber());
			System.out.println("Messaging from network : " + sim.getnetworkProvider());
		} else {
			System.out.println("Sim is not activated....");
		}
	}

}
