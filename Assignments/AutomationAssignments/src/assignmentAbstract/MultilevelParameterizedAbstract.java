package assignmentAbstract;
abstract class Student
{
	Student(String fname)
	{
		System.out.println("Student Name : "+fname);
	}
}
class library extends Student
{
	library(String fname1,String location)
	{
		super(fname1);
		System.out.println("Library Location : "+location);
	}
}
class Book extends library
{	
	Book(String fname11,String location1,String Bookname)
	{
		super(fname11,location1);
		System.out.println("Book Name : "+Bookname);
	}
}
public class MultilevelParameterizedAbstract {

	public static void main(String[] args) {
		// Q.03 Multilevel Parameterized Abstract
		new Book("Karan","Bharath","Geology");
	}
}