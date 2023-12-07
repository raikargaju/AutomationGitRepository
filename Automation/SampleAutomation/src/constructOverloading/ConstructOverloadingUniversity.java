package constructOverloading;

class University
{
	University(String UName)
	{
		System.out.println("University Name:"+UName);
	}
	University(String ClgName,int ClgCode)
	{
		System.out.println("College Name:"+ClgName);
		System.out.println("College Code: "+ClgCode);
	}
	University(String Clgadd,String Stname,int Pincode)
	{
		System.out.println("College Address:"+Clgadd);
		System.out.println("State Name:"+Stname);
		System.out.println("PinCode: "+Pincode);
	}
}

public class ConstructOverloadingUniversity {

	public static void main(String[] args) {
		// Construct Overloading for University
		new University(" Visweswaraya Technological University");
		new University(" Jain College of Engineering",205);
		new University(" Sai Nagar Hubballi"," Karnataka",580024);
	}

}
