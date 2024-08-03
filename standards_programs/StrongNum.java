import java.util.Scanner;
class StrongNum 
{
	public static int factorialNum(int n){
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;

		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt(),temp=n,sum=0;
		while(temp>0){
			int digit=temp%10;
			sum+=factorialNum(digit);
			temp/=10;
		}
		if(n==sum)
		System.out.println(n+" is a strong number");
		else
		System.out.println(n+" is not a strong number");
	}
}
