import java.util.Scanner;
class SpyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number");
		int n=sc.nextInt(),temp=n,sum=0,prod=1;
		while(temp>0){
			sum+=temp%10;
			prod*=temp%10;
			temp/=10;
		}
		if(sum==prod)
			System.out.println(n+" is a Spy Number");
		else
			 System.out.println(n+" is not a Spy Number");

		
	}
}
