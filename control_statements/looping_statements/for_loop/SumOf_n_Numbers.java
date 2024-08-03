import java.util.Scanner;
class SumOf_n_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int N=sc.nextInt(),sum=0;
		System.out.println(" Enter the "+N+" numbers ");
		if(N>0){
		for(int i=1;i<=N;i++)
		{
				int a=sc.nextInt();
				sum=sum+a;
		}
				System.out.println("Sun of these numbers is "+sum);

		}
	}
}
