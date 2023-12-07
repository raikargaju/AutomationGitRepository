package assignmentArray;

public class ByteArrayReverseForLoop {

	public static void main(String[] args) {
		// Read Byte Array in Reverse Order Using For Loop
		byte[] byteArray = {10, 20, 30, 40, 50};
		System.out.println("Reversed array:");
		for (int i = byteArray.length - 1; i >= 0; i--)
		{
			System.out.println(byteArray[i] + " ");
		}
	}
}