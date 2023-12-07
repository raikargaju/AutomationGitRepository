package assignmentStatic;
class ArrayDemo6
{
	int[] resultantArray(int a[],int b[])
	{
		int x[] = new int[a.length+b.length];
		int k = 0;
		for(int i = 0;i < a.length;i++)
		{
			x[k] = a[i];
			k++;
		}
		for(int j = 0;j < b.length;j++)
		{
			x[k] = b[j];
			k++;
		}
		return x;
	}
}
public class OneDResultantArray {

	public static void main(String[] args) {
		ArrayDemo6 O = new ArrayDemo6();
		int a[] = {5,7,9};
		int b[] = {4,6,8};
		int z[] = O.resultantArray(a, b);
		for(int i = 0;i < z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
}