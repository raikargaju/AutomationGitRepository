package com.sgtesting.Assignment2darray;

public class IntegerArrayModulusOperatorMatrixFormat {

	public static void main(String[] args) {
		// Integer Array apply Modulus Operator read in Matrix Format
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]%2+" ");
			}
			System.out.println();
		}
	}
}