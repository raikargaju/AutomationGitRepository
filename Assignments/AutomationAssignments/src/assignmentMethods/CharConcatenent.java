package assignmentMethods;
class Demo
{
	Demo(char a[][])
	{
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				char b = a[i][j];
				System.out.print(b);
			}
		}
	}
}
public class CharConcatenent {

	public static void main(String[] args) {
		// Character Array 2D and Transpose the Array
		char a[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		new Demo(a);
	}
}