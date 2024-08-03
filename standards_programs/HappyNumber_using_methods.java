import java.util.Scanner;
class HappyNumber_using_methods
{
	public static int sum(int n){
		int s=0;
		while(n>0){
			int d=n%10;
			s+=d*d;
			n/=10;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		while(n>9)
			n=sum(n);
		
		if(n==1)
			System.out.println("Happy Number");
		else
			System.out.println("not a happy number");
	}
}
