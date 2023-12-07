package com.sgtesting.noargsconstructor;

class Country
{
	int CtyNo;
	String ContinentName;
	String CtyName;
	Country()
	{
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		CtyNo = 1;
		System.out.println("Continent Number: "+CtyNo);
		ContinentName = "Asia";
		System.out.println("Continent Name: "+ContinentName);
		CtyName = "India";
		System.out.println("Country Name: "+CtyName);
		System.out.println("************************");
	}
}

class State
{
	int StateNo;
	String StateName;
	String StateCapital;
	State()
	{
		System.out.println("STATE DETAILS:");
		System.out.println("------------------------");
		StateNo = 11;
		System.out.println("State Number: "+StateNo);
		StateName = "Karnataka";
		System.out.println("State Name: "+StateName);
		StateCapital = "Bangalore";
		System.out.println("State Capital: "+StateCapital);
		System.out.println("************************");
	}
}

class District
{
	int DistNo;
	String DistName;
	String DistStateName;
	District()
	{
		System.out.println("DISTRICT DETAILS:");
		System.out.println("------------------------");
		DistNo = 21;
		System.out.println("District Number: "+DistNo);
		DistName = "Dharwad";
		System.out.println("District Name: "+DistName);
		DistStateName = "Karnataka";
		System.out.println("District State Name: "+DistStateName);
		System.out.println("************************");
	}
}

class Taluk
{
	int TlkNo;
	String TalukName;
	String DistName;
	Taluk()
	{
		System.out.println("TALUK DETAILS:");
		System.out.println("------------------------");
		TlkNo = 101;
		System.out.println("Taluk Number: "+TlkNo);
		TalukName = "Navalgund";
		System.out.println("Taluk Name: "+TalukName);
		DistName = "Dharwad";
		System.out.println("Taluk District Name: "+DistName);
		System.out.println("************************");
	}
}

public class ObjectClassForCountryStateDistrictTaluk {

	public static void main(String[] args) {
		new Country();
		new State();
		new District();
		new Taluk();
	}
}