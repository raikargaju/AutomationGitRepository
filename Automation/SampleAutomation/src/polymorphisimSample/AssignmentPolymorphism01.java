package polymorphisimSample;
abstract class Person
{
	abstract void behaviour();
}
class Student extends Person
{
	void behaviour()
	{

		System.out.println("Is a Student");
	}
}
class Teacher extends Person
{
	void behaviour()
	{
		System.out.println("Is a Teacher");

	}

}
class Friend extends Person
{
	void behaviour()
	{
		System.out.println("Is a Friend");
	}
}
class Customer extends Person
{
	void behaviour()
	{
		System.out.println("Is a Customer");
	}
}
class Father extends Person
{
	void behaviour()
	{
		System.out.println("Is a Father");
	}
}
public class AssignmentPolymorphism01 {

	public static void main(String[] args) {
		Student st =new Student();
		Teacher tch=new Teacher();
		Friend frd=new Friend();
		Customer cst=new Customer();
		Father fa=new Father();
		st.behaviour();
		tch.behaviour();
		frd.behaviour();
		cst.behaviour();
		fa.behaviour();
	}

}
