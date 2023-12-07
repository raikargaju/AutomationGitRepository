package assignmentStatic;
class ArrayDemo1
{
	int[] arrayAdd(int a[],int b[])
	{
		int x[] = new int[a.length];
		int k = 0;
		for(int i = 0;i < a.length;i++)
		{
			x[k] = a[i] + b[i];
			k++;
		}
		return x;
	}
}
public class OneDArrayAddition {

	public static void main(String[] args) {
		ArrayDemo1 O = new ArrayDemo1();
		int c[] = {2,4,6,8};
		int d[] = {1,3,5,7};
		int res[] = O.arrayAdd(c, d);
		for(int i = 0;i < res.length;i++)
			System.out.println(res[i]);
	}
}
