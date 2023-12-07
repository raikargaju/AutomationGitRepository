package paramiterizedConstructor;

class Desktop
{
	int DetpID;
	String MfrName;
	String DetpType;
	int DetpPrice;
	Desktop(int Did,String Mfn,String Dtt,int Dp)
	{
		System.out.println("DESKTOP DETAILS:");
		System.out.println("------------------------");
		DetpID = Did;
		System.out.println("Desktop ID: "+DetpID);
		MfrName = Mfn;
		System.out.println("Desktop Name: "+MfrName);
		DetpType = Dtt;
		System.out.println("Desktop Type: "+DetpType);
		DetpPrice = Dp;
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
	Laptop(int Lid,String Mfn,String Mi,int Lp)
	{
		System.out.println("LAPTOP DETAILS:");
		System.out.println("------------------------");
		LapID = Lid;
		System.out.println("Laptop ID: "+LapID);
		MfrName = Mfn;
		System.out.println("Manufactured Name: "+MfrName);
		Madein = Mi;
		System.out.println("Made in: "+Madein);
		LapPrice = Lp;
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
	Mobile(int Mn,String Mfn,int Mfy,int Mp)
	{
		System.out.println("MOBILE DETAILS:");
		System.out.println("------------------------");
		MblNo = Mn;
		System.out.println("Mobile No: "+MblNo);
		MfrName = Mfn;
		System.out.println("Manufactured Name: "+MfrName);
		MfrYear = Mfy;
		System.out.println("Manufactured Year: "+MfrYear);
		MblPrice = Mp;
		System.out.println("Mobile Price: "+MblPrice);
		System.out.println("************************");
	}
}

public class ObjectClassForDesktopLaptopMobile {

	public static void main(String[] args) {
		// Object Class For Desktop Laptop Mobile
		new Desktop(5,"Lenovo","All In One",25000);
		new Laptop(6,"MSI","India",50000);
		new Mobile(7,"Iphone",2023,80000);

	}
}