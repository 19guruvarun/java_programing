import java.util.Scanner;
class SumOfEvenNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int a=sc.nextInt();
		System.out.println("Enter ending value");
		int b=sc.nextInt(),sum=0;
		do
		{
			sum+=a;
			a++;
		}
		while (a<=b);
		System.out.println(sum);
	}
}
