package com.demo.final_key;

public class Sports {
	private int numberOfTeamMembers;
	private String name;

	public Sports(int numberOfTeamMembers, String name) {
		super();
		this.numberOfTeamMembers = numberOfTeamMembers;
		this.name = name;
	}

	public String getNumberOfTeamMembers() {
		return "In "+name+" ,";
	}

	public String getName() {
		return "Each team has "+numberOfTeamMembers+" players " ;
	}

	
}
