package samplePrograms;
class Demo1
{
	Demo1(int a[])
	{
		int sum = 0;
		for(int i = 0;i < a.length;i++)
		{
			sum += a[i];
		}
		System.out.println("Sum Result: "+sum);
	}
}
public class ConstructorChainingDemo2 {

	public static void main(String[] args) {
		// Constructor Chaining example 2
		int b[] = {2,4,6,8,10};
		new Demo1(b);
	}
}
