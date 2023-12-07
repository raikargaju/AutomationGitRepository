package com.sgtesting.Array;

public class SingleDimentionalArrayDemo1 {

	public static void main(String[] args) {
		// Declare an Array
		int arr[] = {100,200,300,400,500,600};
		// Read Elements from Array
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}	
	}
}