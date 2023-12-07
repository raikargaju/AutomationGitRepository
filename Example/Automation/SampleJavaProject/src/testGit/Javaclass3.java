package testGit;
abstract class School
{
	static void SchoolName(String name)
	{
		System.out.println("School Name : "+name);
	}
	static void SchoolLocation(String location)
	{
		System.out.println("School Location : "+location);
	}
}
public class Javaclass3 {

	public static void main(String[] args) {
		School.SchoolName("Fatima High school");
		School.SchoolLocation("Hubballi");
	}

}