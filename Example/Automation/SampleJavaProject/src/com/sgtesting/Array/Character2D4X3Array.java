package com.sgtesting.Array;

public class Character2D4X3Array {

	public static void main(String[] args) {
		char a[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'}};
		for (int i = 0;i <a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}