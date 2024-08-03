import java.util.Scanner;
class FindSumOfFactors
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),sum=0;
		System.out.println("The factors of "+n+" are ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
				sum+=i;
			}
		}
		System.out.println("The factors sum  is "+sum);
	}
}
