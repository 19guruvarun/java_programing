
import java.util.Scanner;
class LargestDig
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),larDig=n%10;
		n=n/10;
		while(n>0)
		{
			int dig=n%10;
			if(dig>larDig)
				larDig=dig;
			n=n/10;
		}
		System.out.println(larDig);
	}
}
