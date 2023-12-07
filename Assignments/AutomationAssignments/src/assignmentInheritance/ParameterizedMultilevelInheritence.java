package assignmentInheritance;

class Student1
{
	Student1(String fname,String location)
	{
		System.out.println("First Name : "+fname);
		System.out.println("Location : "+location);
	}
}
class Library extends Student1
{
	String bookname;
	Library(String fname,String location,String bookname)
	{
		super(fname,location);	
		this.bookname = bookname;
		System.out.println("Book Name : "+bookname);
	}
}
class Sport extends Library
{
	String Sname;
	Sport(String fname,String location,String bookname,String Sname)
	{
		super(fname,location,bookname);
		this.Sname = Sname;
		System.out.println("Sport : "+Sname);
	}
}

public class ParameterizedMultilevelInheritence {
	public static void main(String[] args) {
		// Question No 4
		new Sport("Gajanan","Hubballi","Python","PC Gaming");
	}
}