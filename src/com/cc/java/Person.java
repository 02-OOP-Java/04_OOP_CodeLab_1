package com.cc.java;

public class Person {
	
	private String firstName;
	private String familyName;
	private int birthYear;
	
	/**
	 * @param firstName
	 * @param familyName
	 * @param birthYear
	 */
	public Person(String firstName, String familyName, int birthYear) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.birthYear = birthYear;
	}
	
	
	protected String getPersonalData() {
		return "Hi, I am " + firstName + " " + familyName + "and I was born in " + birthYear + ".";
	}


	protected String getFirstName() {
		return firstName;
	}


	protected String getFamilyName() {
		return familyName;
	}
	
	
	
	
	
}

