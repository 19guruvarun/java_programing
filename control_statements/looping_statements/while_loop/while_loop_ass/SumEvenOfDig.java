import java.util.Scanner;
class SumEvenOfDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),temp=n,sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			if(rem%2==0)
			sum+=rem;
			temp/=10;
		}
		System.out.println("Sum even digits in number "+n+" is "+sum);
	}
}
