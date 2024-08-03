import java.util.Scanner;
class  NeonNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt(),sqr=n*n,sum=0;
		while(sqr>0){
			sum+=(sqr%10);
			sqr/=10;
		}
		if(sum==n)
		System.out.println(n+" is a neon number");
		else
		System.out.println(n+" is not a neon number");
	}
}
