package com.sgtesting.Assignmentsingledarray;

public class SingleDArrayDivisiblebyFour {

	public static void main(String[] args) {
		// Single Dimensional Array Divisible by Four
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		System.out.println("# of Elements: "+count);
		//Declare an Array
		int a[]=new int[count];
		//Assign Divisible by four into an array
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				a[k]=j;
				k++;
			}
		}
		//Read Elements
		for(int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}

	}

}