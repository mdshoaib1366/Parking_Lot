package com.may02.task2;

public interface MobilePhoneInterface {
	
	void insertSim(SIMCardInterface sim);

	void removeSim(SIMCardInterface sim);

	void makeCalls(SIMCardInterface sim);

	void sendText(SIMCardInterface sim);

}
