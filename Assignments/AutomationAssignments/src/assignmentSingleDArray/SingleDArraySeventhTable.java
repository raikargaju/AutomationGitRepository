package assignmentSingleDArray;

public class SingleDArraySeventhTable {

	public static void main(String[] args) {
		int a[]=new int[10];
		int num=7;
		int k=0;
		for(int i=10;i>0;i--)
		{
			int res=i*num;
			a[k]=res;
			k++;
		}
		for(int m=a.length-1;m>=0;m--)
		{
			System.out.println(a[m]);
		}
	}
}