package assignmentInheritance;

class College
{
	String Collname;
	String location;
	int Pno;
	College()
	{
		Collname = "JCET";
		location = "Habli";
		Pno = 258489412;
		System.out.println("College Name : "+Collname);
		System.out.println("Location : "+location);
		System.out.println("Phone Number : "+Pno);
	}	
}
class Branch extends College
{
	String Bname;
	String Floor;
	int Pno;
	Branch()
	{
		Bname = "Mechanical Enigenering";
		Floor = "2nd Floor";
		Pno = 521456123;
		System.out.println("Branch Name : "+Bname);
		System.out.println("Floor : "+Floor);
		System.out.println("Phone Number : "+Pno);		
	}
}
class Student extends Branch
{
	String Sid;
	String Sname;
	int Pno;
	Student()
	{
		Sid = "G011";
		Sname = "Ravi";
		Pno = 972456123;
		System.out.println("Student Id : "+Sid);
		System.out.println("Student name : "+Sname);
		System.out.println("Phone Number : "+Pno);	
	}
}

public class MultilevelInheritence {
	public static void main(String[] args) {
		// Question No 1
		new Student();
	}
}