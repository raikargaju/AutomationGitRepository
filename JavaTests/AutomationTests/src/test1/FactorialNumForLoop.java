package test1;

public class FactorialNumForLoop {

	public static void main(String[] args) {
		// Factorial Value of a given Number usingFor Loop
		int fact = 1;
		int n = 8;
		for(int i = n;i >= 1;i--)
		{
			fact *= i;
		}
		System.out.println(fact);
	}
}