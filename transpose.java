import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int t[][]=new int[50][50];
		int i,j,row,col;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the no.of rows in the matrix:");
		row=s1.nextInt();
		System.out.println("Enter the no.of columns in the matrix:");
		col=s1.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("Enter the a["+i+"]["+j+"]th element:");
				a[i][j]=s1.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				t[i][j]=a[j][i];
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<row;i++)
		{
			System.out.println("\n");
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
		}
		System.out.println("The transpose of the matrix is:");
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<col;j++)
			{
				System.out.print(t[i][j]+"\t");
			}
			System.out.println("\n");
		}
		s1.close();
	}
}
