package test3;
class Sum
{
	{
		System.out.println("Gagan");
	}
	void math()
	{
		System.out.println("Anand");
	}
}
class Sum3
{
	static void math2()
	{
		Sum o = new Sum();
		o.math();
	}
}
public class classstaticmethodqq3 {

	public static void main(String[] args) {
		// Q.03 class static method
		Sum3.math2();
	}
}