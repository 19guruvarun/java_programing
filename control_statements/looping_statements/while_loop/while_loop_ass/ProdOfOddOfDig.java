import java.util.Scanner;
class ProdOfOddOfDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),temp=n,prod=1;
		while(temp>0)
		{
			int rem=temp%10;
			if(rem%2==1)
			prod*=rem;
			temp/=10;
		}
		System.out.println("Product of odd digits in number "+n+" is "+prod);
	}
}
