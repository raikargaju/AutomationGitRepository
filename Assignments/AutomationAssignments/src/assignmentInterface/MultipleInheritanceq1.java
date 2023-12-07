package assignmentInterface;
interface A
{
	void methodA();
}
interface B
{
	void methodB();
}
interface C
{
	void methodC();
}
class Class implements A, B, C
{
	public void methodA()
	{
		System.out.println("A implementation");
	}
	public void methodB()
	{
		System.out.println("B implementation");
	}
	public void methodC()
	{
		System.out.println("C implementation");
	}
}
public class MultipleInheritanceq1 {

	public static void main(String[] args) {
		// Q.01 Multiple Inheritance subclass implements more than two interface.
		Class O = new Class();
		O.methodA();
		O.methodB();
		O.methodC();
	}
}