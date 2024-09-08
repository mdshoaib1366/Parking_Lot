package com.task.march19;

public class PanCard {
	private String panId;
	
	public PanCard()
	{
		this.panId = "abc123";
		new Person(this);
	}

	@Override
	public String toString() {
		return "PanCard [panId=" + panId + "]";
	}
	
}
