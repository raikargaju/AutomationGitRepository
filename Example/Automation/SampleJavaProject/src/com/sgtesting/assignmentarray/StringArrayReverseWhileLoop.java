package com.sgtesting.assignmentarray;

public class StringArrayReverseWhileLoop {

	public static void main(String[] args) {
		// Read String Array in Reverse using While Loop
		String[] s1 = {"Apple","Banana","Orange","Grape"};
		System.out.println("String Array:");
		int i = s1.length - 1;
		while (i >= 0) {
			System.out.println(s1[i]);
			i--;
		}
	}
}