import java.util.Scanner;
class ForLoopSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,sum=0;
		System.out.println("Enter starting value");
		a=sc.nextInt();
		System.out.println("Enter ending value");
		b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.println("sum of numbers in  between "+a+" to "+b+" is "+sum);
	}
}
