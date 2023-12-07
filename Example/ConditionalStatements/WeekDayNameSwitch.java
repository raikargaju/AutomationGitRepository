class WeekDayNameSwitch
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		switch(n)
		{
			case 1:
			System.out.println(n+" Monday");
			break;
			case 2:
			System.out.println(n+" Tuesday");
			break;
			case 3:
			System.out.println(n+" wednesday");
			break;
			case 4:
			System.out.println(n+" Tursday");
			break;
			case 5:
			System.out.println(n+" Friday");
			break;
			case 6:
			System.out.println(n+" Saturday");
			break;
			case 7:
			System.out.println(n+" Sunday");
			break;
		default:
			System.out.println(n+" is Invalid Number!");
		}
	}
}