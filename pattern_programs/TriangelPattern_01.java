import java.util.Scanner;
class TriangelPattern_01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			System.out.print("  ");
			for (int j=0;j<star;j++ )
				System.out.print(" *");
			System.out.println();
				star+=2;
				space-=1;
					
			}
			
	}
}
