import java.util.*;
class matsub
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int sub[][]=new int[50][50];
		int i,j,row,col;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the no.of rows:\n");
		row=s1.nextInt();
		System.out.println("Enter the no.of columns:");
		col=s1.nextInt();
		System.out.println("matrix B:\n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("Enter the a["+i+"]["+j+"] Element:");
				a[i][j]=s1.nextInt();
			}
		}
		System.out.println("matrix B:\n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("Enter the b["+i+"]["+j+"] Element:");
				b[i][j]=s1.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("The sum of the matrices are:");
		for(i=0;i<row;i++)
		{
			System.out.println("\t");
			for(j=0;j<col;j++)
			{
				System.out.println(sub[i][j]+"\t");
			}
		}
		s1.close();
	}
}
	
		
