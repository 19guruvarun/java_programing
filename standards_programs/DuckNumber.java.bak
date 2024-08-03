import java.util.Scanner;
class DuckNumber 
{
	public static boolean isDuckNum(int n){
		
		while(n>0)
		{
			if(n%10==0)
				return true;
			n/=10;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isDuckNum(n))
			System.out.println(n+" is a duck number");
		else
			System.out.println(n+" is not a duck number");
	}
}
