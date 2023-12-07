package test3;
class Demo2
{
	{
		new Demo1();
		System.out.println("Praveen");
	}
}
class Demo1
{
	static
	{
		System.out.println("Rajesh");
	}
}
public class instanceBlockq1 {

	public static void main(String[] args) {
		// Q.01 instance Block
		new Demo2();
	}
}