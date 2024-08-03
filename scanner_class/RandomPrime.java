import java.util.*;
class RandomPrime 
{
	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Random r=new Random();
		int num=r.nextInt(100000,999999);
		System.out.println(num);
		while(num>0)
		{
			if(isPrime(num%10))
				System.out.println(num%10);
			num/=10;
		}
	}
}

