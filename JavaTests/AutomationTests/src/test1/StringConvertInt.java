package test1;

public class StringConvertInt {

	public static void main(String[] args) {
		String a[] = {"10","20","30","40","50","60"};
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			sum = sum + Integer.parseInt(a[i]);
		}
		System.out.println(sum);
	}
}