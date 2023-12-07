package assignmentInheritance;

class Company
{
	String Cname;
	String location;
	int Pno;
	Company()
	{
		Cname = "Lenovo";
		location = "Bangalore";
		Pno = 978574152;
		System.out.println("Company Name : "+Cname);
		System.out.println("Location : "+location);
		System.out.println("Phone Number : "+Pno);
	}	
}
class Employee1 extends Company
{
	String Eid;
	String EmploName;
	int Pno;
	Employee1()
	{
		Eid = "025";
		EmploName = "Chandru";
		Pno = 787840152;
		System.out.println("Employee Id : "+Eid);
		System.out.println("Employee Name : "+EmploName);
		System.out.println("Phone Number : "+Pno);
	}	
}
class Employee2 extends Company
{
	String Eid;
	String EmploName;
	int Pno;
	Employee2()
	{
		Eid = "N018";
		EmploName = "Nagaraj";
		Pno = 985540252;
		System.out.println("Employee Id : "+Eid);
		System.out.println("Employee Name : "+EmploName);
		System.out.println("Phone Number : "+Pno);
	}	
}

public class HeirachelInheritence {
	public static void main(String[] args) {
		// Question No 2
       new Employee1();
       System.out.println("------------------");
       new Employee2();
	}
}