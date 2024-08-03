import java.util.Scanner;
class ForLoopSumEvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value a:");
		int a=sc.nextInt();
		System.out.println("Enter the ending value b:");
		int b=sc.nextInt(),sum=0;
		for(int i=a;i<=b;i++)
				sum+=i;
		if(sum%2==0)
			System.out.print("sum numbers between "+a+ " and "+b+" is "+" even number ");
		else
			System.out.print("sum numbers between "+a+ " and "+b+" is "+" odd number ");


		
	}
}
