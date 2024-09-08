package com.may02.task2;

public class Testing01 {

	public static void main(String[] args) {
		
		MobilePhone iphone = new MobilePhone();
		Jio sim1 = new Jio();
		Airtel sim2 = new Airtel();
		BSNL sim3 = new BSNL();
		
		interactSimCard(iphone, sim1);
		System.out.println();
		interactSimCard(iphone, sim3);
		
		
	}
	
	private static void interactSimCard(MobilePhone m ,SIMCardInterface sim)
	{
		m.insertSim(sim);
		m.makeCalls(sim);
		m.sendText(sim);
		m.removeSim(sim);
	}
}

/*

package com.rabi.nit;

interface SimCard {
	long getNumber();

	String networkProvider();

	boolean isActivated();

	boolean isDeactivated();
}

class Jio implements SimCard {
	private long num = (long) (Math.random() * 10000000000l);

	@Override
	public long getNumber() {
		return num;
	}

	@Override
	public String networkProvider() {
		return this.getClass().getSimpleName();
	}

	@Override
	public boolean isActivated() {

		return true;
	}

	@Override
	public boolean isDeactivated() {
		return false;
	}

}

class Airtel implements SimCard {
	private long num = (long) (Math.random() * 10000000000l);

	@Override
	public long getNumber() {
		return num;
	}

	@Override
	public String networkProvider() {
		return this.getClass().getSimpleName();
	}

	@Override
	public boolean isActivated() {

		return true;
	}

	@Override
	public boolean isDeactivated() {
		return false;
	}

}

class BSNL implements SimCard {
	private long num = (long) (Math.random() * 10000000000l);

	@Override
	public long getNumber() {
		return num;
	}

	@Override
	public String networkProvider() {
		return this.getClass().getSimpleName();
	}

	@Override
	public boolean isActivated() {

		return true;
	}

	@Override
	public boolean isDeactivated() {
		return false;
	}

}

interface MobilePhone {
	void insertSim(SimCard sim);

	void removeSim(SimCard sim);

	void makeCalls(SimCard sim);

	void sendMsg(SimCard sim);

}

class Iphone implements MobilePhone {
	private boolean isActive;

	@Override
	public void insertSim(SimCard sim) {
		isActive = sim.isActivated();
		System.out.println(sim.networkProvider() + " Sim is inserted");
	}

	@Override
	public void removeSim(SimCard sim) {
		isActive = sim.isDeactivated();
		System.out.println(sim.networkProvider() + " Sim is removed");

	}

	@Override
	public void makeCalls(SimCard sim) {
		if (isActive) {
			System.out.println("Calling from number : " + sim.getNumber());
			System.out.println("Calling from network : " + sim.networkProvider());
		} else {
			System.out.println("Sim is not activated....");
		}
	}

	@Override
	public void sendMsg(SimCard sim) {
		if (isActive) {
			System.out.println("Messaging from number : " + sim.getNumber());
			System.out.println("Messaging from network : " + sim.networkProvider());
		} else {
			System.out.println("Sim is not activated....");
		}
	}

}

public class TestPhone {
	public static void main(String[] args) {
		Iphone ip = new Iphone();
		Jio j = new Jio();
		Airtel a = new Airtel();
		BSNL b = new BSNL();
		interactSimCard(ip, j);
		Iphone pro15 = new Iphone();
		interactSimCard(pro15, b);

	}

	private static void interactSimCard(MobilePhone m, SimCard sim) {

		m.insertSim(sim);
		m.removeSim(sim);
		m.makeCalls(sim);
		m.sendMsg(sim);
	}
}

*/