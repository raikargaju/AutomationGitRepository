package com.sgtesting.Assignment2darray;

public class CharArrayDoWhileLoop {

	public static void main(String[] args) {
		// Character Array using Do While Loop
		char ch[][]= {{'M','N','O'},{'P','Q','R'}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(ch[i][j]+" ");
				j++;
			}while(j<ch[i].length);
			System.out.println();
			i++;
		}while(i<ch.length);

	}
}