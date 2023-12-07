package arraySample;

public class String2D3x3Array {

	public static void main(String[] args) {
		 String a[][] = {{"Anand","Arun","Akash"},{"Naveen","Praveed","Prakash"},{"Rohit","Ravi","Raju"}};
		 for (int i = 0;i <a.length;i++)
		 {
			 for(int j = 0;j<a[i].length;j++)
			 {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}
