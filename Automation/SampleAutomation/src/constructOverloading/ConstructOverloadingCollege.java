package constructOverloading;

class College
{
	College(String Clgname)
	{
		System.out.println("College Name:"+Clgname);
	}
	College(String Clgadd,int Clgcode)
	{
		System.out.println("College Address:"+Clgadd);
		System.out.println("College University Code: "+Clgcode);
	}
}
public class ConstructOverloadingCollege {

	public static void main(String[] args) {
		// Construct Overloading  for College
		new College(" Fatima PU College");
		new College(" Keshwapur Hubballi.",312);
	}
}