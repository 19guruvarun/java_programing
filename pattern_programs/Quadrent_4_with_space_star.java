import java.util.Scanner;
class Quadrent_4_with_space_star 
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
			for(int i=1;i<=star;i++)
				System.out.print(" *");
			for(int j=1;j<=space;j++)
				System.out.print("  ");
			System.out.println();
			star--;
			space++;
		}
	}
}
