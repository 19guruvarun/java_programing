import java.util.Scanner;
class Diamond
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			System.out.print("  ");
			for (int j=1;j<=star;j++ )
				System.out.print(" *");
			System.out.println();
			if(i<(n+1)/2)
			{
				star+=2;
				space--;
			}

			else
			{
				star-=2;
				space++;
			}
		}
			
	}
}