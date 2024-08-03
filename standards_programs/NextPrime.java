import java.util.*;
class NextPrime 
{
	public static boolean isPrime(int n)
	{
		if(n<2) return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int nextPrime(int n)
	{
		if(n<1)
			return 2;
		int next_Prime=n;
		boolean f=false;
		while(!f)
		{
			next_Prime++;
			if(isPrime(next_Prime))
				f=true;
		}
		return next_Prime;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(nextPrime(n));
	}
}
