package assignmentArray;

public class ShortArrayDoWhileLoop {

	public static void main(String[] args) {
		// Read Short Array using Do While Loop
		short[] shortarray = {11,21,31,41,51,61};
		System.out.println("Short Array:");
		int i = 0;
		do {
			System.out.println(shortarray[i]);
			i++;
		} while (i < shortarray.length);
	}
}