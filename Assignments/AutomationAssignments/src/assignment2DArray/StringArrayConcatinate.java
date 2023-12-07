package assignment2DArray;

public class StringArrayConcatinate {

	public static void main(String[] args) {
		// String Array Concatenation all Elements
		String a[][]= {{"My ","Name is ","Gajanan. "},{"I am ","from ","Navalgund. "},{"I completed ","my Graduation ","in JCET."}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
		}
	}
}