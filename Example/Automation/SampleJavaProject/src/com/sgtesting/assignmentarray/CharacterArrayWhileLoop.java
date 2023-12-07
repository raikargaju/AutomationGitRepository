package com.sgtesting.assignmentarray;

public class CharacterArrayWhileLoop {

	public static void main(String[] args) {
		// Read Character Array Using WhileLoop
		char[] charArray = {'A','E','I','O','U'};
		int i = 0;
		System.out.println("Character Array:");
		while (i < charArray.length) {
			System.out.println(charArray[i]);
			i++;
		}
	}
}