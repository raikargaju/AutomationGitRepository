package com.sgtesting.Assignment2darray;

public class IntegerArrayTransposeForLoop {

	public static void main(String[] args) {
		// Integer Array & Transpose the elements using For Loop
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}
}