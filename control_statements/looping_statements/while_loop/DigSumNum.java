import java.util.Scanner;
class DigSumNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),sum=0,m=n;
		while(n>0)
		{
			//int r=n%10;
			sum+=(n%10);
			n=n/10;
		}
		System.out.println("Sum of digits in the number "+m+" is "+sum);
		
	}
}
