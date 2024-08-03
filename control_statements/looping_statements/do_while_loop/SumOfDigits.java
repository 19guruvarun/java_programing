import java.util.Scanner;
class SumOfDigits 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt(),sum=0,temp=n;
		do
		{
			sum+=temp%10;
			temp/=10;
		}
		while (temp>0);
		System.out.println("Sum of digits in number "+n+" is "+sum);
	}
}
