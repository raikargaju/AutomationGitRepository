package assignmentAbstract;

abstract class School
{
	static void SchoolName(String name)
	{
		System.out.println("School Name :"+name);
	}
	static void SchoolLocation(String location)
	{
		System.out.println("School Location : "+location);
	}
}
public class AbstractStaticMethod {

	public static void main(String[] args) {
		// Q.01 Abstract Static Method
		School.SchoolName("Fatima High school");
		School.SchoolLocation("Hubballi");
	}
}