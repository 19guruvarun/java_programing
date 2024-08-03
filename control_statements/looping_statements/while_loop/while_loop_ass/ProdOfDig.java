import java.util.Scanner;
class ProdOfDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),temp=n,prod=1;
		while(temp>0)
		{
			int rem=temp%10;
			prod*=rem;
			temp/=10;
		}
		System.out.println("Product of digits in number "+n+" is "+prod);
	}
}
