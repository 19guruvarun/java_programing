import java.util.Scanner;
class FindFactorialFactors 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt(),fact=1;
		for(int i=1;i<=n;i++)
		
			fact*=i;
		
		System.out.print("The factorial of "+n+" is "+fact+" and its factors are ");

		for(int i=1;i<=fact;i++)
		{
			if(fact%i==0)
				System.out.print(i+ " ");
		}
	}
}
