package test6;
abstract class Demo
{
	void A (String name)
	{
		System.out.println(name);
	}
	static
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
}
class block extends Demo
{
	block (String name1)
	{
		System.out.println(name1);
	}
}
public class Q3AbstractClass {

	public static void main(String[] args) {
		// Q3 Abstract Class contains Constructors, Static block & Instance block.
		new block("Welcome to BHARAT");
	}
}