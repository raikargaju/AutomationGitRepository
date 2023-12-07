package polymorphisimSample;

abstract class EduInstitutes
{
	abstract void EduInstituteType();
}
class Government1 extends EduInstitutes
{
	void EduInstituteType()
	{
		String a="Public org";
		System.out.println("EduInstituteType:"+a);
	}
}
class UnAided extends EduInstitutes
{
	void EduInstituteType()
	{
		String b="Private UnAided org";
		System.out.println("EduInstituteType:"+b);
	}
}
class Aided extends EduInstitutes
{
	void EduInstituteType()
	{
		String c="Private Aided org";
		System.out.println("EduInstituteType:"+c);
	}
}


public class PolyEducationalInstitutions {

	public static void main(String[] args) {
		
		Government1 government=new Government1(); 
		UnAided unAided=new UnAided();
		Aided aided=new Aided();
		
		government.EduInstituteType();
		unAided.EduInstituteType();
		aided.EduInstituteType();

	}

}
