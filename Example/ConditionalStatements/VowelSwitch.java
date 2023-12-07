class VowelSwitch
{
	public static void main(String args[])
	{
		char ch = args[0].charAt(0);
		switch(ch)
		{
			case 'A':
				System.out.println(ch+" is a Vowel");
				break;
			case 'E':
				System.out.println(ch+" is a Vowel");
				break;
			case 'I':
				System.out.println(ch+" is a Vowel");
				break;
			case 'O':
				System.out.println(ch+" is a Vowel");
				break;
			case 'U':
				System.out.println(ch+" is a Vowel");
				break;
			default:
				System.out.println(ch+" is not a Vowel");
		}
	}
}
