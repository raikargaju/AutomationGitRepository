package interfaceSample;
interface University
{
	void showUniversityName(String name);
}
class Jcet implements University
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name : "+name);
	}
	void displaylocation(String location)
	{
		System.out.println("College Location : "+location);
	}
}
public class SampleDemo1 {

	public static void main(String[] args) {
		Jcet O = new Jcet();
		O.showUniversityName("VTU");
		O.displaylocation("Hubballi");
	}
}