import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		while(n>9){
			int	sum=0;
			while(n>0){
				int d=n%10;
				int exp=1;
				for(int i=1;i<=2;i++)
					exp*=d;
				sum+=exp;
				n/=10;
			}
			n=sum;
			
				
		}
		
		if(n==1)
			System.out.println("Happy Number");
		else
			System.out.println("not a happy number");
	}
}
