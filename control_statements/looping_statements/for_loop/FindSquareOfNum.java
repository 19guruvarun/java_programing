import java.util.Scanner;
class FindSquareOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value");
		int a=sc.nextInt();
		System.out.println("Enter the ending value");
		int b=sc.nextInt();
		System.out.print("The square of numbers from "+a+" to "+b+" is ");
		for(int i=a;i<=b;i++)
		{
			System.out.print((i*i)+" ");

		}
		
	}
}