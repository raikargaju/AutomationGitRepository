package assignmentStatic;
class Demoarray
{
	static int []array(int a[])
	{
		int x = 0;
		int arr[] = new int [a.length];
		for(int i = a.length-1; i >= 0;i--)
		{
			arr[x] = a[i];
			x++;
		}
		return arr;
	}
}
public class IntegerArray2DSubReturnSecondHalf {

	public static void main(String[] args) {
		// Integer Array 2D Sub Return Second Half.
		int z[] = {10,20,30,40,50,60,70,80,90};
		int res[] = Demoarray.array(z);
		for(int i = 0;i < res.length;i++)
		{
			System.out.println(res[i]);
		}
		System.out.println("--------------------");
		for(int a : res)
		{
			System.out.println(a);
		}
	}
}