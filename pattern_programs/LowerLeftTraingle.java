import java.util.Scanner;
class LowerLeftTraingle 
{
	public static void main(String[] args) 
	{
		//Q1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows and coloums values");
		int n=sc.nextInt();
		for(int r=1;r<=5;r++)
		{
			/*for(int c=1;c<=r;c++)
			{
				
				System.out.print(" * ");


			}*/

			for(int c=1;c<=5;c++)
			{
				if(c<=r)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
