import java.util.Scanner;
class PatterLeftDiagonal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows and coloums values");
		int n=sc.nextInt();
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r+c==(n+1))
				System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}
	}
}