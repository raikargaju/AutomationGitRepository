package com.sgtesting.assignmentarray;

public class DoubleArrayReverseDoWhileLoop {

	public static void main(String[] args) {
		// Read Double Array in Reverse using Do While Loop
        double[] doubleArray = {0.5,1.0,1.5,2.0,2.5,3.0};
		System.out.println("Reversed array:");
        int i = doubleArray.length - 1;
        do {
            System.out.println(doubleArray[i]);
            i--;
        } while (i >= 0);
	}
}