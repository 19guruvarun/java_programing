import java.util.Scanner;
class FindProdOfNumAndFactors 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value");
		int a=sc.nextInt();
		System.out.println("Enter the ending value");
		int b=sc.nextInt(),prod=1;
		for(int i=a;i<=b;i++)
		
			prod*=i;
		
		System.out.print("The product of numbers from "+a+" to "+b+" is "+prod+" and its factors are ");

		for(int i=1;i<=prod;i++)
		{
			if(prod%i==0)
				System.out.print(i+ " ");
		}
	}
}
