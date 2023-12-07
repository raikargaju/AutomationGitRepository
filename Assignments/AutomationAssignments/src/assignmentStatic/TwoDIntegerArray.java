package assignmentStatic;
class ArrayDemo3
{
	int[] integerArray(int a[][])
	{
		int x[] = new int[a.length*a[0].length];
		int k = 0;
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a[i].length;j++)
			{
				x[k] = a[i][j];
				k++;
			}
		}
		return x;
	}
}
public class TwoDIntegerArray {

	public static void main(String[] args)
	{
		ArrayDemo3 O = new ArrayDemo3();
		int y[][] = {{2,4},{8,10}};
		int res[] = O.integerArray(y);
		for(int i = 0;i<res.length;i++)
			System.out.println(res[i]);
	}
}
