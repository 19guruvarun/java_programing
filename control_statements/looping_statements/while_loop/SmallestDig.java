
import java.util.Scanner;
class SmallestDig
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),smallDig=n%10;
		n=n/10;
		while(n>0)
		{
			int dig=n%10;
			if(dig<smallDig)
				smallDig=dig;
			n=n/10;
		}
		System.out.println(smallDig);
	}
}
