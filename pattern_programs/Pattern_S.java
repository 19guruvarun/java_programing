import java.util.Scanner;
class Pattern_S 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows and coloums values");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if((r==1)||(c==1 && r!=(n+1)/2)||(r==(n+1)/2&&c!=1))

					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}