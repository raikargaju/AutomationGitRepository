package assignmentArray;

public class FloatArraySecondHalfWhileLoop {

	public static void main(String[] args) {
		// Read Float Array Second Half using While Loop
		float[] ft = {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f};
		int i = ft.length/2;
		while(i < ft.length)
		{
			System.out.println(ft[i]);
			i++;
		}
	}
}