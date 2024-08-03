import java.util.Scanner;
class TriangelPattern_02
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		int star=2*n-1;
		int space=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=space;j++)
			System.out.print("  ");
			for (int j=1;j<=star;j++ )
				System.out.print(" *");
			System.out.println();
				star-=2;
				space+=1;
					
			}
			
	}
}
