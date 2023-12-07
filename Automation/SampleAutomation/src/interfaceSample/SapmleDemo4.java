package interfaceSample;
interface University3
{
	void showUniversityName(String name);
}
interface College3
{
	abstract void displayCollegeName(String name);
}
class JainCollege3 implements College3,University3
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
public class SapmleDemo4 {

	public static void main(String[] args) {
		// we cannot create a object or instance for interface.
		JainCollege3 O = new JainCollege3();
	//  O.showUniversityName("VTU");
		O.displayCollegeName("Jain College");
	//  O.displayLocation("Bangalore");
	}

}
