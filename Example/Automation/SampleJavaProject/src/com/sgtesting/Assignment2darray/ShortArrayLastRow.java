package com.sgtesting.Assignment2darray;

public class ShortArrayLastRow {

	public static void main(String[] args) {
		// Short Array read Last Row
		short a[][]= {{25,35,45},{22,42,48},{67,38,28}};
		for(int i=a.length-1;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}