import java.util.Scanner;
class CountFactorsOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt(),c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
					c++;
		}
		System.out.print("The factors count of "+n+" is : "+c+" ");
		
	}
}
