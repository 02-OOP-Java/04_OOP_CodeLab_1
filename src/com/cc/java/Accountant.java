package com.cc.java;

public class Accountant extends Mitarbeiter{

	/**
	 * @param firstName
	 * @param familyName
	 * @param birthYear
	 * @param workID
	 * @param department
	 * @param role
	 */
	public Accountant(String firstName, String familyName, int birthYear, int workID, String department, String role) {
		super(firstName, familyName, birthYear, workID, department, role);
		
	}

	public String doYourJob() {
		return "I am a " + role + " and I'm calling a customer!";
	}


}


