import java.util.Scanner;
class FactorsOfSumOfDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),temp=n,sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			
			sum+=rem;
			temp/=10;
		}
		System.out.println("Sum of digits in number "+n+" is "+sum+" and its factors are: ");
		for(int i=1;i<=sum;i++)
		{
			if(sum%i==0)
				System.out.print(i+" ");
		}
	}
}
