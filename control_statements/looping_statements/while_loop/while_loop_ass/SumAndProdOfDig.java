import java.util.Scanner;
class SumAndProdOfDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),temp=n,prod=1,sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			prod*=rem;
			sum+=rem;
			temp/=10;
		}
		System.out.println("Sum and Product of digits in number "+n+" is "+sum+", "+prod);
	}
}
