package test1;

public class ByteArraySecondRow2D {

	public static void main(String[] args) {
		// Q10. Byte Array Read Second Row 2D for 2 x 3
		byte ba[][] = {{10,20,30},{40,50,60}};
		for(int i = 1;i<ba.length;i++)
		{
			for(int j = 0;j<=ba.length;j++)
			{
				System.out.print(ba[i][j]+" ");
			}
		}
		System.out.println();
	}
}