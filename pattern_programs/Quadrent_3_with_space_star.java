import java.util.Scanner;
class Quadrent_3_with_space_star 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows and coloums values");
		int n=sc.nextInt();
		int star=n;
		int space=0;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=space;i++)
				System.out.print("  ");
			for(int j=1;j<=star;j++)
				System.out.print(" *");
			System.out.println();
			star--;
			space++;
		}
	}
}