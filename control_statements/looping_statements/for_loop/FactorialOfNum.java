import java.util.Scanner;
class FactorialOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a N value");
		int N=sc.nextInt(),fact=1;
		for(int i=N;i>=1;i--)
				fact*=i;
		System.out.println("Factorial of "+N+" is "+fact);
	}
}
