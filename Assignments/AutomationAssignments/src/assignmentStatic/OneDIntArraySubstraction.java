package assignmentStatic;
class ArrayDemo2
{
	int [] arraySub(int a[],int b[])
	{
		int x[] = new int[a.length];
		int k = 0;
		for(int i = 0;i < a.length;i++)
		{
			x[k] = a[i] - b[i];
			k++;
		}
		return x;
	}
}
public class OneDIntArraySubstraction {

	public static void main(String[] args) {
		ArrayDemo2 O = new ArrayDemo2();
		int w[] = {8,16,24,26};
		int y[] = {4,8,16,24};
		int res[] = O.arraySub(w, y);
		for(int i = res.length/2;i < res.length;i++)
			System.out.println(res[i]);
	}
}