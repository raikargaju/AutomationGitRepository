package assignmentMethods;
class Demov
{
	Demov(String s[][])
	{
		for(int i = s.length-1;i < s.length;i++)
		{
			for(int j = 0;j < s.length;j++)
			{
				System.out.print(s[i][j]);
			}
		}
		System.out.println();
	}
}
public class StringConcatenent {

	public static void main(String[] args) {
		// String Conc read 3rd array
		String s[][] = {{"One","two","three"},{"four","five","six"},{"Seven","eight","nine"}};
		new Demov(s);
	}
}