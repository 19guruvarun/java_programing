import java.util.Scanner;
class MultOf5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int a=sc.nextInt();
		System.out.println("Enter ending value");
		int b=sc.nextInt();
		do
		{
			if(a%5==0)
				System.out.print(a+" ");
			a++;

		}
		while (a<=b);
	}
}
