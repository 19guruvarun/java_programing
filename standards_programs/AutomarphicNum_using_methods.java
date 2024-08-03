
import java.util.Scanner;
class  AutomarphicNum_using_methods 
{
	public static int count(int n){
		int c=0;
		while(n>0){
			c++;
			n/=10;
		}
		return c;
	}
	public static int expo(int n){
		int e=1;
		for(int i=1;i<=count(n);i++)
			e*=10;
		return e;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		if((n*n)%expo(n)==n)
				System.out.println(n+" is a Automarphic number");
		else
				System.out.println(n+" is not a Automarphic number");
	}
}