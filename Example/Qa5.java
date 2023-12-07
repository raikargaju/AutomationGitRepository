package www.sgtesting.interfacedemo;

interface AdditionDemo
{
	void addition(int x,int y);
}
interface SubstractDemo extends AdditionDemo
{
	abstract void substract(int a,int b);
}
class Multipcation implements AdditionDemo,SubstractDemo
{
	public void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
	public void substract(int a,int b)
	{
		System.out.println("substraction Result :"+(a-b));
	}
	  void mult(int c,int d)
	  {
		 System.out.println("Multiplication Result :"+(c*d)); 
	  }
}
public class Qa5 {
	public static void main(String[] args) {
		Multipcation o=new Multipcation();
		o.addition(10, 30);
		o.substract(30, 20);
		o.mult(2, 10);
	}
}
