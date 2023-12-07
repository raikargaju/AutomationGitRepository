package assignment2DArray;

public class ByteArrayWhileLoop {

	public static void main(String[] args) {
		// Byte Array using While Loop
		byte a[][] = {{1,2,3},{7,8,9},{4,5,6}};
		int i = 0;
		while(i < a.length)
		{
			int j = 0;
			while(j < a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}