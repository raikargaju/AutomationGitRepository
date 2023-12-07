package assignmentInheritance;

class Studente
{
	Studente(String fname,String location)
	{
		System.out.println("First Name : "+fname);
		System.out.println("Location : "+location);
	}
}
class Librarya extends Studente
{
	String bookname;
	Librarya(String fname,String location,String bookname)
	{
		super(fname,location);	
		this.bookname = bookname;
		System.out.println("Book Name : "+bookname);
	}
}
class Sporta extends Studente
{
	String Sname;
	Sporta(String fname,String location,String bookname,String Sname)
	{
		super(fname,location);
		this.Sname = Sname;
		System.out.println("Sport : "+Sname);
	}
}

public class ParameterizedHiracelInheritence {
	public static void main(String[] args) {
		// Question No 6
		new Sporta("Arun","Banglore","Python","Chess");
		System.out.println("-------------------------------");
		new Sporta("Praveen","Raichur","core java","Base Ball");
	}
}
