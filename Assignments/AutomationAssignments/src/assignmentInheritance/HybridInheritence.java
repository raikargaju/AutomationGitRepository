package assignmentInheritance;

class Company1
{
	String Cname;
	String location;
	int Pno;
	Company1()
	{
		Cname = "TATA POWER";
		location = "Bangalore";
		Pno = 245289152;
		System.out.println("Company Name : "+Cname);
		System.out.println("Location : "+location);
		System.out.println("Phone Number : "+Pno);
	}	
}
class Employee3 extends Company1
{
	String Eid;
	String EmploName;
	Double Salary;
	Employee3()
	{
		Eid = "R1122";
		EmploName = "Rakesh";
		Salary = 21200.2;
		System.out.println("Employee Id : "+Eid);
		System.out.println("Employee Name : "+EmploName);
		System.out.println("Salary : "+Salary);
	}	
}
class Employee4 extends Employee1
{
	String Eid;
	String EmploName;
	Double Salary;
	Employee4()
	{
		Eid = "253";
		EmploName = "Karthik";
		Salary = 25500.2;
		System.out.println("Employee Id : "+Eid);
		System.out.println("Employee Name : "+EmploName);
		System.out.println("Salary : "+Salary);
	}	
}
class Manager extends Company1
{
	String Mid;
	String ManagerName;
	Double Salary;
	Manager()
	{
		Mid = "M101";
		ManagerName = "Mehak";
		Salary = 62500.2;
		System.out.println("Employee Id : "+Mid);
		System.out.println("Employee Name : "+ManagerName);
		System.out.println("Salary : "+Salary);
	}	
}

public class HybridInheritence {
	public static void main(String[] args) {
	// Question No 3
	new Manager();
    System.out.println("-----------------------");
    new Employee4();
	}
}