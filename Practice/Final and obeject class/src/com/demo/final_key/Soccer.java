package com.demo.final_key;

public class Soccer extends Sports {
	
	public Soccer(int numberOfTeamMembers, String name) {
		super(numberOfTeamMembers, name);
		
	}

	public String getNumberOfTeamMembers() {
		return super.getName();
	}

	public String getName() {
		return super.getNumberOfTeamMembers() ;
	}
}
