class CommandLineArg
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		System.out.println(x);
		char ch = args[1].charAt(0);
		System.out.println(ch);
		String s1 = args[2];
		System.out.println(s1);
	}
}