package assignment2DArray;

public class IntegerArrayFirstRow {

	public static void main(String[] args) {
		// Integer Array read First Row
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		for(int i = 0;i < a.length/2;i++)
		{
			for(int j = 0;j < a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}