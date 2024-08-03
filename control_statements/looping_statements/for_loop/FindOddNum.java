import java.util.Scanner;
class FindOddNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
				System.out.print(i+" ");
		}
		
		
	}
}
