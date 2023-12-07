package com.sgtesting.Array;

public class SingleDimentionalArrayDemo {

	public static void main(String[] args) {
		// Declare an Array
		int arr[] = new int[4];
		// Assign the Elements
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		// Read Elements from Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}