import java.util.Scanner;
class StrongNumSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int s=sc.nextInt();
		System.out.println("Enter the ending range");
		int e=sc.nextInt();
		for(int n=s;n<=e;n++){
			int sum=0,t=n;
			while(t>0){
				int d=t%10;
				int fact=1;
				for(int i=1;i<=d;i++)
					fact*=i;
				sum+=fact;

				t/=10;
			}
			if(sum==n)
				System.out.print(n+" ");	
			}
	}
}
