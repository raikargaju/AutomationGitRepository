package test1;

public class SumFirstHalfIntegerArray1D {

	public static void main(String[] args) {
		// Q.4 Sum First Half Integer Array for 1D
		int a[] = {15,28,37,40,50,60};
		int sum = 0;
		for(int i = 0;i<a.length/2;i++)
		{
			sum=sum+a[i];
		}
		System.out.print(sum);
	}
}