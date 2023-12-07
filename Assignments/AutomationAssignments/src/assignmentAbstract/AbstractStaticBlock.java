package assignmentAbstract;
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
public class AbstractStaticBlock {

	public static void main(String[] args) {
		// Q.02 Abstract Static Block
		new Child();
	}
}