import java.util.Scanner;
class FibonaciiSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int a=0,b=1;
		int c=0;
		
		System.out.println("Fibonacii Series :");
		
		for(int i=1;c<=n;i++)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
			
		}
		System.out.println();
		
	}
}
