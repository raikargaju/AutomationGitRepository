package com.sgtesting.assignmentarray;

public class CharacterArraySeconadHalfforLoop {

	public static void main(String[] args) {
		// CharacterArraySeconadHalfforLoop
		char[] ch = {'A','B','C','D','E','F'};
		int i = 0;
		for (i = ch.length/2;i < ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}