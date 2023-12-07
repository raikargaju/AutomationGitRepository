package testGit;
abstract class Parent
{
	static
	{
		System.out.println("Parent : Static Block");
	}
}
class Child extends Parent
{
	static
	{
		System.out.println("Child : Static Block");
	}
}
public class Javaclass2 {

	public static void main(String[] args) {
		new Child();
	}
}