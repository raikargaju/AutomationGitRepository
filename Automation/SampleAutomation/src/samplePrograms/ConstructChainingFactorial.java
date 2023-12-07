package samplePrograms;
class Demo8
{
	void FactDemo8(int fact,int n)
	{
		for(int i = n;i >= 1;i--)
		{
			fact *= i;
		}
		System.out.println("Factoral Value of "+n+" is "+fact);
	}
}
public class ConstructChainingFactorial {

	public static void main(String[] args) {
		// Construct Chaining Factorial
		Demo8 O = new Demo8();
		O.FactDemo8(1,8);
	}
}