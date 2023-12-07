package assignmentObject;

class Country
{
	int CtyNo;
	String ContinentName;
	String CtyName;
}

class State
{
	int StateNo;
	String StateName;
	String StateCapital;
}

class District
{
	int DistNo;
	String DistName;
	String DistStateName;
}

class Taluk
{
	int TlkNo;
	String TalukName;
	String DistName;
}

public class ObjectClassForCountryStateDistrictTaluk {

	public static void main(String[] args) {
		// Object Class For Country State District Taluk
		Country obj1 = new Country();
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		obj1.CtyNo = 1;
		System.out.println("Continent Number: "+obj1.CtyNo);
		obj1.ContinentName = "Asia";
		System.out.println("Continent Name: "+obj1.ContinentName);
		obj1.CtyName = "India";
		System.out.println("Country Name: "+obj1.CtyName);
		System.out.println("************************");
		obj1.CtyNo = 2;
		System.out.println("Continent Number: "+obj1.CtyNo);
		obj1.ContinentName = "Asia";
		System.out.println("Continent Name: "+obj1.ContinentName);
		obj1.CtyName = "Rassia";
		System.out.println("Country Name: "+obj1.CtyName);
		System.out.println("************************");
		obj1.CtyNo = 3;
		System.out.println("Continent Number: "+obj1.CtyNo);
		obj1.ContinentName = "North America";
		System.out.println("Continent Name: "+obj1.ContinentName);
		obj1.CtyName = "USA";
		System.out.println("Country Name: "+obj1.CtyName);
		System.out.println("************************");
		obj1.CtyNo = 4;
		System.out.println("Continent Number: "+obj1.CtyNo);
		obj1.ContinentName = "Europe";
		System.out.println("Continent Name: "+obj1.ContinentName);
		obj1.CtyName = "Germany";
		System.out.println("Country Name: "+obj1.CtyName);
		System.out.println("************************");
		State obj2 = new State();
		System.out.println("STATE DETAILS:");
		System.out.println("------------------------");
		obj2.StateNo = 11;
		System.out.println("State Number: "+obj2.StateNo);
		obj2.StateName = "Karnataka";
		System.out.println("State Name: "+obj2.StateName);
		obj2.StateCapital = "Bangalore";
		System.out.println("State Capital: "+obj2.StateCapital);
		System.out.println("************************");
		obj2.StateNo = 12;
		System.out.println("State Number: "+obj2.StateNo);
		obj2.StateName = "Tamil Namdu";
		System.out.println("State Name: "+obj2.StateName);
		obj2.StateCapital = "Chennai";
		System.out.println("State Capital: "+obj2.StateCapital);
		System.out.println("************************");
		obj2.StateNo = 13;
		System.out.println("State Number: "+obj2.StateNo);
		obj2.StateName = "Telangana";
		System.out.println("State Name: "+obj2.StateName);
		obj2.StateCapital = "Hydrabad";
		System.out.println("State Capital: "+obj2.StateCapital);
		System.out.println("************************");
		obj2.StateNo = 14;
		System.out.println("State Number: "+obj2.StateNo);
		obj2.StateName = "Maharastra";
		System.out.println("State Name: "+obj2.StateName);
		obj2.StateCapital = "Mumbai";
		System.out.println("State Capital: "+obj2.StateCapital);
		System.out.println("************************");
		District obj3 = new District();
		System.out.println("DISTRICT DETAILS:");
		System.out.println("------------------------");
		obj3.DistNo = 21;
		System.out.println("District Number: "+obj3.DistNo);
		obj3.DistName = "Dharwad";
		System.out.println("District Name: "+obj3.DistName);
		obj3.DistStateName = "Karnataka";
		System.out.println("District State Name: "+obj3.DistStateName);
		System.out.println("************************");
		obj3.DistNo = 22;
		System.out.println("District Number: "+obj3.DistNo);
		obj3.DistName = "Solapur";
		System.out.println("District Name: "+obj3.DistName);
		obj3.DistStateName = "Maharastra";
		System.out.println("District State Name: "+obj3.DistStateName);
		System.out.println("************************");
		obj3.DistNo = 23;
		System.out.println("District Number: "+obj3.DistNo);
		obj3.DistName = "Jamnagar";
		System.out.println("District Name: "+obj3.DistName);
		obj3.DistStateName = "Gujarat";
		System.out.println("District State Name: "+obj3.DistStateName);
		System.out.println("************************");
		obj3.DistNo = 24;
		System.out.println("District Number: "+obj3.DistNo);
		obj3.DistName = "Agra";
		System.out.println("District Name: "+obj3.DistName);
		obj3.DistStateName = "Uttar Pradesh";
		System.out.println("District State Name: "+obj3.DistStateName);
		System.out.println("************************");
		Taluk obj4 = new Taluk();
		System.out.println("TALUK DETAILS:");
		System.out.println("------------------------");
		obj4.TlkNo = 101;
		System.out.println("Taluk Number: "+obj4.TlkNo);
		obj4.TalukName = "Navalgund";
		System.out.println("Taluk Name: "+obj4.TalukName);
		obj4.DistName = "Dharwad";
		System.out.println("Taluk District Name: "+obj4.DistName);
		System.out.println("************************");
		obj4.TlkNo = 102;
		System.out.println("Taluk Number: "+obj4.TlkNo);
		obj4.TalukName = "Nargund";
		System.out.println("Taluk Name: "+obj4.TalukName);
		obj4.DistName = "Gadag";
		System.out.println("Taluk District Name: "+obj4.DistName);
		System.out.println("************************");
		obj4.TlkNo = 103;
		System.out.println("Taluk Number: "+obj4.TlkNo);
		obj4.TalukName = "Badami";
		System.out.println("Taluk Name: "+obj4.TalukName);
		obj4.DistName = "Bagalkote";
		System.out.println("Taluk District Name: "+obj4.DistName);
		System.out.println("************************");
		obj4.TlkNo = 104;
		System.out.println("Taluk Number: "+obj4.TlkNo);
		obj4.TalukName = "Gubbi";
		System.out.println("Taluk Name: "+obj4.TalukName);
		obj4.DistName = "Tumakuru";
		System.out.println("Taluk District Name: "+obj4.DistName);
		System.out.println("************************");
	}
}