package assignmentMethods;
class Demoz
{
	void matrixsub(int x[][],int y[][])
	{
		if(x.length == y.length && x[0].length == y[0].length)
		{
			int c[][] = new int[x.length][x[0].length];
			for(int i = 0;i < x.length;i++)
			{
				for(int j = 0;j < x[i].length;j++)
				{
					c[i][j] = x[i][j] - y[i][j];
					System.out.print(c[j][i]+" ");
				}
				System.out.println();
			} 
		}
	}
}
public class SubTwoArrayAndTranspose {

	public static void main(String[] args) {
		// Sub Two Array And Transpose
		Demoz o = new Demoz();
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int b[][] = {{0,10,15},{20,25,30},{35,40,45}};
		o.matrixsub(a,b);
	}
}