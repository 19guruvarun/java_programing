import java.util.Scanner;
class SumOfEvenNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value a:");
		int a=sc.nextInt();
		System.out.println("Enter the ending value b:");
		int b=sc.nextInt(),sum=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2== 0)
				sum+=i;
		}
		System.out.print("sum of even numbers between "+a+ " and "+b+" is "+sum+" ");
		
	}
}
