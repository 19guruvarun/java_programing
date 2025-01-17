import java.util.Scanner;
class TwistedPrime 
{
	public static boolean isPrimeNum(int n){
		if(n==1)
			return false;
		for(int i=2;i<n;i++){
			if(n%i==0)
			{	return false;
			}
		}
		return true;
	}
	public static int reverse(int n){
		int rev=0;
		while(n>0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isPrimeNum(n) && isPrimeNum(reverse(n)))
			System.out.println(n+" is a Twisted prime number");
		else
			System.out.println(n+" is not a Twisted prime  number");
	}
}
