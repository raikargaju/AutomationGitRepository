package test6;
interface A
{
	abstract void display(String name);
}
interface B
{
	abstract void show(String name);
}
class C implements B, A
{
	public void display(String name)
	{
		System.out.println(name);
	}
	public void show(String name)
	{
		System.out.println(name);
	}
}
public class Q1MultipleInheritance {

	public static void main(String[] args) {
		// Q1 Multiple Inheritance
		C ob = new C();
		ob.display("SHIVA");
		ob.show("GAJANAN");
	}
}