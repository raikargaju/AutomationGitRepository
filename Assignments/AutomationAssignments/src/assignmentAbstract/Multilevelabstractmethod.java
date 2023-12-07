package assignmentAbstract;

abstract class ECollege
{
	abstract void showCollegeName(String name);

}
class KAEngCollege extends ECollege
{
	void showCollegeName(String name)
	{
		System.out.println("College Name : "+name);
	}

}
class Branches extends KAEngCollege
{
	void BranchName(String name)
	{
		System.out.println("Branch Name : "+name);
	}
	void displayCityName(String name)
	{
		System.out.println("City Name : "+name);
	}
}
public class Multilevelabstractmethod {

	public static void main(String[] args) {
		// Q.04 Multilevel Abstract Method
		Branches O = new Branches();
		O.BranchName("Mechanical");
		O.displayCityName("Hubballi");
		O.showCollegeName("JCET");
	}
}