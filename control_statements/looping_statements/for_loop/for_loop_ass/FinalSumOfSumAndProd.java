import java.util.Scanner;
class FinalSumOfSumAndProd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value a:");
		int a=sc.nextInt();
		System.out.println("Enter the ending value b:");
		int b=sc.nextInt(),prod=1,sum=0;
		for(int i=a;i<=b;i++)
		{
				sum+=i;
				prod*=i;
		}
		System.out.println("Final sum of sum and product value between the numbers "+a+ " and "+b+" is "+(sum+prod)+" ");
		
		
	}
}


