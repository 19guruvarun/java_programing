import java.util.Scanner;
class FactorsOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		System.out.print("The factors of "+n+" are : ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
					System.out.print(i+" ");
		}
		
	}
}
