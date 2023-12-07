package assignment2DArray;

public class LongArraySumForLoop {

	public static void main(String[] args) {
		// Long Array Sum of all ElementsFor Loop
		long a[][]= {{21,32,43},{64,85,76},{17,58,99}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.print(sum);
	}
}