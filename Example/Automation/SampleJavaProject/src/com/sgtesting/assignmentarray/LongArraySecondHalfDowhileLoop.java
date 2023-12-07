package com.sgtesting.assignmentarray;

public class LongArraySecondHalfDowhileLoop {

	public static void main(String[] args) {
		// Read Long Array Second Half using Do while Loop
		long[] longarray = {100L, 200L, 300L, 400L, 500L, 600L};
		System.out.println("Long Array:");
		int i = longarray.length/2;
		do {
			System.out.println(longarray[i]);
			i++;
		} while (i < longarray.length);
		}
	}