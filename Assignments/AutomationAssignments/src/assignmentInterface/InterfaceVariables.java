package assignmentInterface;
interface Profile
{
	int year = 2020;
	String name = "RAIKAR MARKETING";
	String location = "Bangalore KA";
	int pincode = 560040;
	void printProfile();
}
class showProfile implements Profile
{
	public void printProfile()
	{
		System.out.println("---------Company Profile---------");
		System.out.println("Company Started in Year : " +year);
		System.out.println("Company Name : " +name);
		System.out.println("Company Location : "+location);
		System.out.println("Company Address Pincode : "+pincode);
	}
}
public class InterfaceVariables {

	public static void main(String[] args) {
		// Q.05 An interface contains variables and execute those variables.
		showProfile O = new showProfile();
		O.printProfile();
	}
}