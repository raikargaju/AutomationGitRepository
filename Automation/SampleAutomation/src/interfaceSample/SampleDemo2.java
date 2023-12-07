package interfaceSample;
interface University1
{
	void showUniversityName(String name);
}
interface College
{
	abstract void displayCollegeName(String name);
}
class JainCollege implements University1, College
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
public class SampleDemo2 {

	public static void main(String[] args) {
		// for multiple inheritance.
		JainCollege O = new JainCollege();
		O.showUniversityName("VTU");
		O.displayCollegeName("JCET");
		O.displayLocation("Hubballi");	
	}
}