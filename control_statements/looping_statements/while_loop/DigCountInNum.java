import java.util.Scanner;
class DigCountInNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),c=0,m=n;
		while(n>0)
		{
			//int r=n%10;
			c++;
			n=n/10;
		}
		System.out.println("Number of digit in the number "+m+" is "+c);
		
	}
}
