package com.cc.java;

public class Firma {

	public static void main(String[] args) {
		
	Accountant accountant = new Accountant("Max", "Mustermann", 1980, 1000, "finance", "accountant");
	ausgabe(accountant.getPersonalData());
	ausgabe(accountant.hasLunch());
	ausgabe(accountant.startsWorks());
	ausgabe(accountant.doYourJob());
	ausgabe("----------------------");
	
	Worker worker = new Worker("Gerd", "Müller", 1990, 1001, "manufacturing", "worker");
	ausgabe(worker.getPersonalData());
	ausgabe(worker.hasLunch());
	ausgabe(worker.startsWorks());
	ausgabe(worker.doYourJob());
	ausgabe("----------------------");

	Advertiser advertiser = new Advertiser("Silvia", "Martinelli", 1998, 1002, "PR", "advertiser");
	ausgabe(advertiser.getPersonalData());
	ausgabe(advertiser.hasLunch());
	ausgabe(advertiser.startsWorks());
	ausgabe(advertiser.doYourJob());
	ausgabe("----------------------");
	
	}
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
