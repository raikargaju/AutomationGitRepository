package paramiterizedConstructor;

class Country
{
	int CtyNo;
	String ContinentName;
	String CtyName;
	Country(int cn,String Cname,String ctyn)
	{
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		CtyNo = cn;
		System.out.println("Continent Number: "+CtyNo);
		ContinentName = Cname;
		System.out.println("Continent Name: "+ContinentName);
		CtyName = ctyn;
		System.out.println("Country Name: "+CtyName);
		System.out.println("************************");
	}
}

class State
{
	int StateNo;
	String StateName;
	String StateCapital;
	State(int stn,String Stname,String Sc)
	{
		System.out.println("STATE DETAILS:");
		System.out.println("------------------------");
		StateNo = stn;
		System.out.println("State Number: "+StateNo);
		StateName = Stname;
		System.out.println("State Name: "+StateName);
		StateCapital = Sc;
		System.out.println("State Capital: "+StateCapital);
		System.out.println("************************");
	}
}

class District
{
	int DistNo;
	String DistName;
	String DistStateName;
	District(int Dn,String Dtn,String Dsn)
	{
		System.out.println("DISTRICT DETAILS:");
		System.out.println("------------------------");
		DistNo = Dn;
		System.out.println("District Number: "+DistNo);
		DistName = Dtn;
		System.out.println("District Name: "+DistName);
		DistStateName = Dsn;
		System.out.println("District State Name: "+DistStateName);
		System.out.println("************************");
	}
}

class Taluk
{
	int TlkNo;
	String TalukName;
	String DistName;
	Taluk(int Tn,String TkN,String Dn)
	{
		System.out.println("TALUK DETAILS:");
		System.out.println("------------------------");
		TlkNo = Tn;
		System.out.println("Taluk Number: "+TlkNo);
		TalukName = TkN;
		System.out.println("Taluk Name: "+TalukName);
		DistName = Dn;
		System.out.println("Taluk District Name: "+DistName);
		System.out.println("************************");
	}
}

public class ObjectClassForCountryStateDistrictTaluk {

	public static void main(String[] args) {
		// Object Class For Country State District Taluk
		new Country(1,"Asia","India");
		new State(2,"Karnataka","Bangalore");
		new District(3,"Dharwad","Karnataka");
		new Taluk(4,"Navalgund","Dharwad");
	}
}