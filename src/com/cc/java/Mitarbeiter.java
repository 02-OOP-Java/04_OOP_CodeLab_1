package com.cc.java;

public class Mitarbeiter extends Person{

	protected int workID;
	protected String department;
	protected String role;
	
	/**
	 * @param firstName
	 * @param familyName
	 * @param birthYear
	 * @param workID
	 * @param department
	 * @param role
	 */
	public Mitarbeiter(String firstName, String familyName, int birthYear, int workID, String department, String role) {
		super(firstName, familyName, birthYear);
		this.workID = workID;
		this.department = department;
		this.role = role;
	}
	
	protected String hasLunch() {
		return "I am " + getFirstName() + " " + getFamilyName() + " and I'm having lunch.";
	}
	
	protected String startsWorks() {
		return "I am " + getFirstName() + " " + getFamilyName() + " and I'm starting my work at " + department + ".";
	}

	
	
}

