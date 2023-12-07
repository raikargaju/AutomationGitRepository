package Test1;

public class Concatenate2DReverse {

	public static void main(String[] args) {
		// String Array Concatenation all Elements
		String a[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
