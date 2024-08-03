import java.util.Scanner;

class  ForLoopProduct
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value");
		int a=sc.nextInt();
		System.out.println("Enter the ending value");
		int b=sc.nextInt();
		int prod=1;
		for(int i=a;i<=b;i++)
		{
			prod*=i;
		}
		System.out.println("Product of numbers from range "+a+" to "+b+" is "+prod);

	}
}
