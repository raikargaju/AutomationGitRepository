package com.sgtesting.assignmentarray;

public class IntegerArraySumNumForLoop {

	public static void main(String[] args) {
		// Read Integer Array and Sum of all Numbers using For Loop
		int[] n = {5,10,15,20,25,30,35,40};
		System.out.println("Sum of Integer Array:");
		int i,sum;
		sum = 0;
		for(i = 0;i < n.length;i++)
		{
			sum = sum + n[i];
		}
		System.out.println(sum);
	}
}