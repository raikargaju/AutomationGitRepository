package com.sgtesting.Assignment2darray;

public class DoubleArrayReverse {

	public static void main(String[] args) {
		// Double Array in Reverse Order for 2D Array
		double a[][] = {{0.1,0.2,0.3},{1.1,1.2,1.3},{2.1,2.2,2.3}};
		for(int i = a.length-1;i >= 0;i--)
		{
			for(int j = a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

		}
	}
}