package com.shoaib.relation;

public class Engine {
	public int engineNumber;
	public String type;
	public double capacity;

	public Engine(int engineNumber, String type, double capacity) {
		super();
		this.engineNumber = engineNumber;
		this.type = type;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", type=" + type + ", capacity=" + capacity + "]";
	}

	
}
