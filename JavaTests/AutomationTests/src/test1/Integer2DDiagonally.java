package test1;

public class Integer2DDiagonally {

	public static void main(String[] args) {
		// Integer 2D Diagonally
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 1;i<=a.length/2;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				System.out.println(a[i][j]+" ");
			}
		}
		System.out.println();
	}
}