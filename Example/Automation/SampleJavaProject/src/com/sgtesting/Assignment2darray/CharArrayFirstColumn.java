package com.sgtesting.Assignment2darray;

public class CharArrayFirstColumn {

	public static void main(String[] args) {
		// Character Array read First Column
		char ch[][]= {{'A','B','C'},{'M','N','O'},{'X','Y','Z'}};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length/2;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}
}