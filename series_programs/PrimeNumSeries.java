import java.util.Scanner;
class PrimeNumSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int start=sc.nextInt();
		System.out.println("Enter the end range");
		int end=sc.nextInt();
		for(int n=start;n<=end;n++){
			int i;
			for(i=2;i<=n;i++){
				if(n%i==0)
					break;
			}
			if(n==i)
				System.out.print(n+" ");
		}
		System.out.println();
	}
}
