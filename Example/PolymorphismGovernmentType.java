package com.sgtesting.Polymorphism;


abstract class Government
{
	abstract void GovernmentType();
	
}
class Democratic extends Government
{
	void GovernmentType()
	{
		String a="Bharath";
		System.out.println("Democratic Government: "+a);
	}
}
class Monarchy extends Government
{
	void GovernmentType()
	{
		String b="Saudi Arabia";
		System.out.println("Monarchy Government: "+b);
	}
}
class Republic extends Government
{
	void GovernmentType()
	{
		String c="America";
		System.out.println("Republic Government: "+c);
	}
}
public class PolymorphismGovernmentType {

	public static void main(String[] args) {
		
		Government government=null;
		Democratic democratic =new Democratic();
		Monarchy monarchy=new Monarchy();
		Republic republic=new Republic();
		
		
		government =democratic;
		democratic.GovernmentType();
		
		government =monarchy;
		monarchy.GovernmentType();
		
		government =republic;
		republic.GovernmentType();
		
	}

}

