import java.util.Scanner;
class NthPalindromeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the nth value");
		int nth=sc.nextInt();
		int n=1,pos=0;
		while(n>0)
		{
			int t=n,rev=0;
			while(t>0)
			{
				int d=t%10;
				rev=rev*10+d;
				t/=10;
			}
			if(rev==n)
				pos++;
			if(pos==nth)
				break;
			n++;
		}
		System.out.println(nth+" palindrome number is "+n);
	}
}
