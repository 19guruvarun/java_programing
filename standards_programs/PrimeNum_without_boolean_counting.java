import java.util.Scanner;
class PrimeNum_without_boolean_counting
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i;//-->intialization done outside of for loop
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				
				break;
			}		
		}
		if(i==n)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");

}
}
