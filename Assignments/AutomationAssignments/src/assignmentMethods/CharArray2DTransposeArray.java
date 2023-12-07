package assignmentMethods;
class Demoh
{
	Demoh(char a[][])
	{
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
public class CharArray2DTransposeArray {

	public static void main(String[] args) {
		// Character Array 2D and Transpose the Array
		char a[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		new Demoh(a);
	}
}