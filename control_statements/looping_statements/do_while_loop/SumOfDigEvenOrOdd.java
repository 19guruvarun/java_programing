import java.util.Scanner;
class SumOfDigEvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt(),sum=0;
		
		do
		{
			sum+=a%10;
			a/=10;

		}
		while (a>0);
		if(sum%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
}
