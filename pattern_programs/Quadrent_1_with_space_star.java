import java.util.Scanner;
class Quadrent_1_with_space_star 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows and coloums values");
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=star;i++)
				System.out.print(" *");
			/*for(int j=1;j<=space;j++)
				System.out.print("  ");*/
			System.out.println();
			star++;
			//space--;
		}
	}
}
