package interfaceSample;
interface University2
{
	void showUniversityName(String name);
}
interface College2 extends University2
{
	abstract void displayCollegeName(String name);
}
class JainCollege2 implements College2
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name : "+name);
	}
	public void displayCollegeName(String name)
	{
		System.out.println("College Name : "+name);
	}
	void displayLocation(String location)
	{
		System.out.println("College Location : "+location);
	}
}
public class SampleDemo3 {

	public static void main(String[] args) {
		// One interface can extends another interface.
		JainCollege2 O = new JainCollege2();
		O.showUniversityName("VTU");
		O.displayCollegeName("Jain College");
		O.displayLocation("Bangalore");
	}
}