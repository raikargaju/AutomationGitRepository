package com.sgtesting.Assignment2darray;

public class StringArraySecondRow {

	public static void main(String[] args) {
		// String Array read Second Row
		String a[][]= {{"India","England","Germany"},{"Bharat","Karnataka","Bangalore"},{"Bangalore","Hubballi","Mangalore"}};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[1][i]+" ");
		}
	}
}