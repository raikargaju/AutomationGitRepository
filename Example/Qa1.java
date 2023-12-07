package www.sgtesting.interfacedemo;

interface University
{
	void UniversityName(String name);
}
interface College
{
	abstract void CollegeName(String name);
}
interface Student
{
	abstract void StudentName(String name);
}
class RitEngineering implements University,College,Student
{
	public void UniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	public void CollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
	public void StudentName(String name)
	{
		System.out.println("Student Name :"+name);
	}
	void location(String location)
	{
	    System.out.println("Location :"+location);	
	}
}
public class Qa1 {
	public static void main(String[] args) {
		RitEngineering o=new RitEngineering();
		o.UniversityName("Vtu");
		o.CollegeName("Rajeev Institute of Technology");
		o.StudentName("Bharath");
		o.location("Belgaum");

	}

}
