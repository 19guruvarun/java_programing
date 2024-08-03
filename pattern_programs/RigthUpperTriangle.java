import java.util.Scanner;
class RigthUpperTriangle 
{
	public static void main(String[] args) 
	{

		//Q4
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows and coloums values");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(c+r<=(n+1))
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}
	}
}
