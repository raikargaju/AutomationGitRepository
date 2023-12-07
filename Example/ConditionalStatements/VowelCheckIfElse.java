class VowelCheckIfElse
{
	public static void main(String args[])
	{
		char ch = args[0].charAt(0);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch+" is a Vowel.");
		}
		else
		{
			System.out.println(ch+" is not a Vowel.");
		}
	}
}