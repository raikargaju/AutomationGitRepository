package com.sgtesting.noargsconstructor;

class Desktop
{
	int DetpID;
	String MfrName;
	String DetpType;
	int DetpPrice;
	Desktop()
	{
		System.out.println("DESKTOP DETAILS:");
		System.out.println("------------------------");
		DetpID = 111;
		System.out.println("Desktop ID: "+DetpID);
		MfrName = "HP";
		System.out.println("Desktop Name: "+MfrName);
		DetpType = "Home";
		System.out.println("Desktop Type: "+DetpType);
		DetpPrice = 25000;
		System.out.println("Desktop Price: "+DetpPrice);
		System.out.println("************************");
	}
}

class Laptop
{
	int LapID;
	String MfrName;
	String Madein;
	int LapPrice;
	Laptop()
	{
		System.out.println("LAPTOP DETAILS:");
		System.out.println("------------------------");
		LapID = 121;
		System.out.println("Laptop ID: "+LapID);
		MfrName = "Lenovo";
		System.out.println("Manufactured Name: "+MfrName);
		Madein = "JAPAN";
		System.out.println("Made in: "+Madein);
		LapPrice = 25000;
		System.out.println("Laptop Price: "+LapPrice);
		System.out.println("************************");
	}
}

class Mobile
{
	int MblNo;
	String MfrName;
	int MfrYear;
	int MblPrice;
	Mobile()
	{
		System.out.println("MOBILE DETAILS:");
		System.out.println("------------------------");
		MblNo = 952158622;
		System.out.println("Mobile No: "+MblNo);
		MfrName = "Lenovo";
		System.out.println("Manufactured Name: "+MfrName);
		MfrYear = 2018;
		System.out.println("Manufactured Year: "+MfrYear);
		MblPrice = 25000;
		System.out.println("Mobile Price: "+MblPrice);
		System.out.println("************************");
	}
}

public class ObjectClassForDesktopLaptopMobile {

	public static void main(String[] args) {
		// Object Class For Desktop Laptop Mobile
		new Desktop();
		new Laptop();
		new Mobile();

	}
}