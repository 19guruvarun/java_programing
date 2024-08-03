import java.util.Scanner;
class DasariumNum_using_methods 
{
	public static int count(int n){
		int c=0;
		while(n>0){
			c++;
			n/=10;
		}
		return c;
	}
	public static int expo(int d,int n){
		int e=1;
		for(int i=1;i<=count(n);i++)
			e*=d;
		return e;
	}
	public static int sumOfDigits(int n){
		int sum=0;
		while(n>0){
			int d=n%10;
			sum+=expo(d,n);
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		if(sumOfDigits(n)==n)
		System.out.println(n+" is a Disarium Number");
		else 
		System.out.println(n+" is not a Disarium Number");

	}
}