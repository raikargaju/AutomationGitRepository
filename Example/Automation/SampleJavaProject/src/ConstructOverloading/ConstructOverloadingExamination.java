package ConstructOverloading;

class Examination
{
	Examination(String Examname)
	{
		System.out.println("Examination Name:"+Examname);
	}
	Examination(String Sbjname,int Sbjcode)
	{
		System.out.println("Subject Name:"+Sbjname);
		System.out.println("Subject code: "+Sbjcode);
	}
}
public class ConstructOverloadingExamination {

	public static void main(String[] args) {
		// Construct Overloading for Examination
		new Examination(" GATE");
		new Examination(" Mechanical",256);
	}

}