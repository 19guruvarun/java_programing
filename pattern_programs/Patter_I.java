import java.util.Scanner;
class Patter_I
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
				if(r==1||r==5||c==(n+1)/2)
					System.out.print(" *");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
