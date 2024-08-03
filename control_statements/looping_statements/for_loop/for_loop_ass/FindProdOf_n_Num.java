import java.util.Scanner;
class FindProdOf_n_Num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int N=sc.nextInt(),prod=1;
		System.out.println(" Enter the "+N+" numbers ");
		for(int i=1;i<=N;i++)
		{
				int a=sc.nextInt();
				prod*=a;
		}
				System.out.println("Porduct of these	 numbers is "+prod);
	}
}
