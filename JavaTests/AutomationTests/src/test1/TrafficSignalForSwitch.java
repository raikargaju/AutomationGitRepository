package test1;

public class TrafficSignalForSwitch {

	public static void main(String[] args) {
		// Traffic Signal Actions For Switch Statement.
		int n = 3;
		switch(n)
		{
		case 1:
			System.out.println("Red - STOP");
			break;
		case 2:
			System.out.println("Yellow - START");
			break;
		case 3:
			System.out.println("Green - GO...!");
			break;
		default:
			System.out.println("Invalid Signal");
		}
	}
}