import java.util.Scanner;
class ProdOfOddNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value a:");
		int a=sc.nextInt();
		System.out.println("Enter the ending value b:");
		int b=sc.nextInt(),prod=1;
		for(int i=a;i<=b;i++)
		{
			if(i%2==1)
				prod*=i;
		}
		System.out.print("prod of odd numbers between "+a+ " and "+b+" is "+prod+" ");
		
	}
}
