import java.util.Scanner;
class MulOfThree
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
				System.out.print(i+" ");
		}
		
		
	}
}
