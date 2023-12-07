package assignmentStatic;

class Demo
{
	static int[] Addition(int a[],int b[])
	{
		int z[] = new int[a.length];
		for (int i = 0; i <  a.length; i++)
		{	
			z[i] = a[i] + b[i];
		}
		return z;
	}
}

public class IntegerArrayAddReturn {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int b[] = {16,25,34,43,52,61};
		int res[] = Demo.Addition(a, b);
		for(int i = 0;i < res.length;i++)
		{
			System.out.println(res[i]);	
		}
	}
}