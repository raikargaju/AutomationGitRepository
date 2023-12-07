package assignmentStatic;
class ArrayDemo5
{
	int[] reverseArray(int a[])
	{
		int x[] = new int[a.length];
		int k = 0;
		for(int i = a.length-1;i >= 0;i--)
		{
			x[k] = a[i];
			k++;
		}
		return x;
	}
}

public class OneDIntReverseOrder {

	public static void main(String[] args) {
		ArrayDemo5 O=new ArrayDemo5();
		int b[] = {4,6,8};
		int c[] = O.reverseArray(b);
		for(int i = 0;i < c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}