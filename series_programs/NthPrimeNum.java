  import java.util.Scanner;
class  NthPrimeNum
{
	public static boolean isprime(int n)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int nth=sc.nextInt();
		int n=1,pos=0;
		while(n>0)
		{
			n++;
			int i;
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
					break;
			
			}
				if(n==i)
				pos++;
				if(pos==nth)
				break;
		}
		System.out.println(nth+" th prime number is "+n);
	/*int i=1,c=0;
		while(c<nth)
		{
			
			i++;
			if(isprime(i))
			{
				
				c++;
			}
			
		}
		
		System.out.println(nth+"th prime number is "+i);

*/
	}
}
